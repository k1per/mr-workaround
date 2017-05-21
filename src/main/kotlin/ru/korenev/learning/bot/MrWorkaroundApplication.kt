package ru.korenev.learning.bot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MrWorkaroundApplication

fun main(args: Array<String>) {
    SpringApplication.run(MrWorkaroundApplication::class.java, *args)
}
