object Dep {
    //gradle
    const val gradle = "com.android.tools.build:gradle:${Ver.gradle}"

    object Kotlin {
        private const val version = "1.4.31"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version}"
        const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${version}"
    }

    //android ui
    object Ui {
        const val appcompat = "androidx.appcompat:appcompat:${Ver.Ui.appcompat}"
        const val coreKtx = "androidx.core:core-ktx:${Ver.Ui.coreKtx}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Ver.Ui.constraintLayout}"
        const val material = "com.google.android.material:material:${Ver.Ui.material}"
    }

    // di
    object Dagger {
        const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Ver.Dagger.hilt}"
        const val hiltAndroid = "com.google.dagger:hilt-android:${Ver.Dagger.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Ver.Dagger.hilt}"
    }

    //test libs
    object Test {
        const val junit = "junit:junit:${Ver.Test.junit}"
        const val extJUnit = "androidx.test.ext:junit:${Ver.Test.extJunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Ver.Test.espresso}"
    }
}