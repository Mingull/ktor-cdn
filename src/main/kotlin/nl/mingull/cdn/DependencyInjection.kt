package nl.mingull.cdn

import nl.mingull.cdn.abstractions.data.ImageRepository
import nl.mingull.cdn.abstractions.services.ImageService
import nl.mingull.cdn.controllers.ImageController
import nl.mingull.cdn.data.DataImageRepository
import nl.mingull.cdn.services.ImageServiceImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

fun repositories() = module {
    singleOf(::DataImageRepository) { bind<ImageRepository>() }
}

fun controllers() = module {
    singleOf(::ImageController)
}

fun services() = module {
    singleOf(::ImageServiceImpl) { bind<ImageService>() }
}