pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://naver.jfrog.io/artifactory/maven/") // Fix the syntax here
        }
    }
}

rootProject.name = "TermProject"
include(":app")
