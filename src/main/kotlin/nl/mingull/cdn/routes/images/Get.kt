package nl.mingull.cdn.routes.images

import io.ktor.server.routing.*
import nl.mingull.cdn.routes.ApiRoute
import nl.mingull.cdn.controllers.ImageController
import org.koin.ktor.ext.inject

@ApiRoute
fun Route.usersRoute() {
    val imageController by inject<ImageController>()
    get("/images") {
        imageController.handleGetImages(call)
    }
}