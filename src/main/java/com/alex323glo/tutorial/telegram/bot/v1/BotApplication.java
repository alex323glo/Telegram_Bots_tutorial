package com.alex323glo.tutorial.telegram.bot.v1;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

/**
 * Telegram bot runner.
 * Registers and executes HelloWorldBot in Telegram Bots API.
 *
 * @author alex323glo
 * @version 0.1.0
 *
 * @see TelegramBotsApi
 */
public class BotApplication {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            botsApi.registerBot(new HelloWorldBot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
