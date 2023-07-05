plugins {
    id(GradlePluginId.ANDROID_APPLICATION)
    kotlin(GradlePluginId.ANDROID)
}

android {
    namespace = AppConfig.APP_ID

    setCompileSdkVersion(AppConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId = AppConfig.APP_ID

        minSdk = AppConfig.MIN_SDK_VERSION
        targetSdk = AppConfig.COMPILE_SDK_VERSION
        versionCode = AppConfig.APP_VERSION_CODE
        versionName = AppConfig.APP_VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.KOTLIN_COMPILER_EXTENSION
    }

    packagingOptions {
        resources.excludes += "META-INF/AL2.0"
        resources.excludes += "META-INF/LGPL2.1"
    }
}

dependencies {

    implementation(AndroidX.ANDROIDX_CORE_KTX)
    implementation(LifecycleLibs.RUNTIME_KTX)
    implementation(Compose.ACTIVITY)
    implementation(Compose.UI)
    implementation(Compose.TOOLING_PREVIEW)
    implementation(Compose.MATERIAL3)
    testApi(TestingLib.JUNIT)
    androidTestApi(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestApi(AndroidTestingLib.ESPRESSO_CORE)
    androidTestApi(AndroidTestingLib.COMPOSE_UI_TEST_JUNIT4)
    debugApi(Compose.TOOLING)
    debugApi(Compose.TEST_MANIFEST)
}