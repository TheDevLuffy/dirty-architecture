pluginManagement {
    val kotlinPluginVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinPluginVersion
    }
}

rootProject.name = "library-dirty-architecture"
include("domain")
