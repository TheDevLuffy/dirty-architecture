pluginManagement {
    val kotlinPluginVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinPluginVersion
    }
}

rootProject.name = "library-dirty-architecture"
include(
    "domain",
    "applications",
    "applications:console",
    "applications:api",
    "applications:event-processor",
    "infras",
    "infras:jpa",
    "infras:mongo",
    "infras:es",
    "infras:memory",
    "clients"
)
