plugins {
    kotlin("jvm") version "1.3.72"
    application
}

group = "ru.geracimov.otus.kotlin"
version = "1.0.0"

application {
    mainClassName="ru.geracimov.otus.kotlin.hw01.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

tasks.test {
    useJUnitPlatform()
}