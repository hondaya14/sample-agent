package co.hondaya

import ai.koog.ktor.aiAgent
import ai.koog.prompt.executor.clients.google.GoogleModels
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
            val response = aiAgent(input = userPrompt, model = GoogleModels.Gemini2_5Flash)
            call.respond(response)
        }
        route("/ai") {
            post("/chat") {
                val userInput = call.receive<String>()
                val output = aiAgent(userInput, model = GoogleModels.Gemini2_5Flash)
                call.respondText(output)
            }
        }
    }
}
