import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.30"
}

repositories {
    mavenCentral()
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    group = "me.alekseinovikov.kager"
    version = "1.0-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_11

    dependencies {
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile>() {
        kotlinOptions.freeCompilerArgs = listOf("-Xjsr305=strict")
        kotlinOptions.jvmTarget = "11"
    }
}
