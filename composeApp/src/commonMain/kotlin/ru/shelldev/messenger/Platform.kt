package ru.shelldev.messenger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform