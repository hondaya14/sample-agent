package co.hondaya

import ai.koog.ktor.Koog
import ai.koog.ktor.aiAgent
import ai.koog.prompt.executor.clients.openai.OpenAIModels
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureFrameworks() {
    val googleApiKey = System.getenv("GOOGLE_API_KEY")

    install(Koog) {
        llm {
            google(apiKey = googleApiKey)
        }
    }
}
