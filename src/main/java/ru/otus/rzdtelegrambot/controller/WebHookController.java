package ru.otus.rzdtelegrambot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.otus.rzdtelegrambot.MyWizardTelegramBot;


@RestController
public class WebHookController {
    private final MyWizardTelegramBot telegramBot;

    public WebHookController(MyWizardTelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public SendMessage onUpdateReceived(@RequestBody Update update) {
        System.out.println(telegramBot.getBotPath());
        return telegramBot.onWebhookUpdateReceived(update);
    }


}
