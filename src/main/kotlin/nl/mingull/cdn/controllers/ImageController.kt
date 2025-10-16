package nl.mingull.cdn.controllers

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.response.respond
import nl.mingull.cdn.data.DataImageRepository

class ImageController(private val imageRepository: DataImageRepository) {
    suspend fun handleGetImages(call: ApplicationCall) {
        call.respond(HttpStatusCode.OK, "Alles oke chappie")
    }
    suspend fun handleImageUpload(call: ApplicationCall) {
        TODO("This method needs to be implemented by this API")
    }
}