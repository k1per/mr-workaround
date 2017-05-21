package ru.korenev.learning.bot.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.TelegramBotsApi
import org.telegram.telegrambots.bots.TelegramLongPollingBot

/**
 * Created by k1per on 21.05.17.
 */
@Configuration
open class BotConfig(@Autowired var env: Environment) {

    @Bean
    open fun telegramBot() : TelegramBotsApi {
        ApiContextInitializer.init()
        val botsApi = TelegramBotsApi()
        botsApi.registerBot(TelegramBot(botToken()))
        return botsApi
    }

    @Bean
    open fun botToken() = env.getProperty("BOT_TOKEN")

    companion object{
        val botName = "Mr.Workaround"
    }

}