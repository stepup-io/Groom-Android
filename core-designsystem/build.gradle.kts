plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.ANDROID)
}

android {
    namespace = "io.groom.core.designsystem"
    setCompileSdkVersion(AppConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdk = AppConfig.MIN_SDK_VERSION
        targetSdk = AppConfig.COMPILE_SDK_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

}

dependencies {

    AndroidX.run {
        implementation(ANDROIDX_CORE_KTX)
    }

    LifecycleLibs.run {
        implementation(RUNTIME_KTX)
    }

    Compose.run {
        api(UI)
        api(MATERIAL)
        api(MATERIAL3)
        api(ACTIVITY)
        api(FOUNDATION)
        api(TOOLING_PREVIEW)
        api(UI_UTIL)

        debugApi(TEST_MANIFEST)
        debugApi(TOOLING_PREVIEW)
    }

    testApi(TestingLib.JUNIT)

    AndroidTestingLib.run {
        androidTestApi(ANDROIDX_TEST_EXT_JUNIT)
        androidTestApi(ESPRESSO_CORE)
        androidTestApi(COMPOSE_UI_TEST_JUNIT4)
    }

}