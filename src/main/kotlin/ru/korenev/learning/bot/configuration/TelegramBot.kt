package ru.korenev.learning.bot.configuration

import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.api.objects.Update
import org.telegram.telegrambots.bots.TelegramLongPollingBot

/**
 * Created by k1per on 21.05.17.
 */
open class TelegramBot(val token: String) : TelegramLongPollingBot() {

    override fun getBotUsername() = BotConfig.botName

    override fun getBotToken(): String = token

    override fun onUpdateReceived(update: Update) {
        if (update.hasMessage() && update.message.text == "Самый лучший язык?") {
            val message = SendMessage()
                    .setChatId(update.message.chatId)
                    .setText("Котлин!")
                sendMessage(message)
        }
    }
}