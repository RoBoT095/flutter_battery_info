plugins {
    id("com.android.library")
}

val kotlinVersion = "1.9.24"

group = "com.igrik12.battery_info"
version = "1.0-SNAPSHOT"

android {
    compileSdk = 34
    namespace = "com.igrik12.battery_info"

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }

    defaultConfig {
        minSdk = 24
    }

    lint {
        disable.add("InvalidPackage")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}


kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}
