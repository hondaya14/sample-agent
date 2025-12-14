package co.hondaya

import ai.koog.ktor.aiAgent
import ai.koog.prompt.executor.clients.openai.OpenAIModels
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/hello-agent") {
            val userPrompt = call.receive<String>()
            val response = aiAgent(input = userPrompt, model = OpenAIModels.Chat.GPT5Codex)
            call.respond(response)
        }
    }
}
