plugins {
    kotlin("jvm") version "1.8.0"
    application
}
repositories {
    mavenCentral() // Можете использовать другие репозитории по необходимости
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.13.2")
    group = "org.example"
    version = "1.0-SNAPSHOT"
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
