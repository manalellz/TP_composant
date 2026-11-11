plugins {
    alias(libs.plugins.android.application)
    id("de.mannodermaus.android-junit5") version "1.13.4.0"
}

android {
    namespace = "com.example.tp_composant"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.tp_composant"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

    // JUnit 4 pour ExampleUnitTest
    testImplementation(libs.junit)

    // JUnit 5 pour MathUtilsTest
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.13.4")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.13.4")

    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}
