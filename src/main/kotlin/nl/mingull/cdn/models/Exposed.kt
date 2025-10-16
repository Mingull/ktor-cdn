package nl.mingull.cdn.models

import org.jetbrains.exposed.v1.jdbc.Database

val database = Database()
Database.connect(database.dataSource)