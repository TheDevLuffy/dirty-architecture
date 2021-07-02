plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:10.1.0")
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib")

        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.0-M1")
    }
}
