package ru.otus.rzdtelegrambot.appconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.rzdtelegrambot.MyWizardTelegramBot;


@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;


    @Bean
    public MyWizardTelegramBot MySuperTelegramBot() {
        return new MyWizardTelegramBot(webHookPath,botUserName,botToken);
    }
}
