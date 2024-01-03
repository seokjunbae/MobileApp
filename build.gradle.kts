buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
        classpath("com.android.tools.build:gradle:8.1.0")
    }

    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://naver.jfrog.io/artifactory/maven/")
        }
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
}
