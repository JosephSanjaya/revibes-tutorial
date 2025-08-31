plugins {
    alias(libs.plugins.sjy.app)
    alias(libs.plugins.sjy.compose)
    alias(libs.plugins.sjy.firebase)
}

android {
    namespace = "com.carissa.revibes"

    defaultConfig {
        applicationId = "com.carissa.revibes"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
dependencies {
}
