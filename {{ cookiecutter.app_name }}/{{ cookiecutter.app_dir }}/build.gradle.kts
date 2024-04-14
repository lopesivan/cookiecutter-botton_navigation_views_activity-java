plugins { id("com.android.application") }

android {
    namespace = "{{ cookiecutter.package_name }}"
    compileSdk = {{ cookiecutter.compileSdk }}

    defaultConfig {
        applicationId = "{{ cookiecutter.package_name }}"
        minSdk = {{ cookiecutter.minSdk }}
        targetSdk = {{ cookiecutter.targetSdk }}
        versionCode = {{ cookiecutter.versionCode }}
        versionName = "{{ cookiecutter.versionName }}"

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures { viewBinding = true }
}

dependencies {
    implementation("androidx.appcompat:appcompat:{{ cookiecutter.__androidx_appcompat_appcompat_version }}")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:{{ cookiecutter.__androidx_constraintlayout_constraintlayout_version }}")
    implementation("androidx.vectordrawable:vectordrawable:1.1.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.navigation:navigation-fragment:2.5.3")
    implementation("androidx.navigation:navigation-ui:2.5.3")
    testImplementation("junit:junit:{{ cookiecutter.__junit_junit_version }}")
    androidTestImplementation("androidx.test.ext:junit:{{ cookiecutter.__androidx_test_ext_junit_version }}")
    androidTestImplementation("androidx.test.espresso:espresso-core:{{ cookiecutter.__androidx_test_espresso_espresso_core_version }}")
    // Fix Duplicate class
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
}
