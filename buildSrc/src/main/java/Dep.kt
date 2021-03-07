object Dep {
    //gradle
    const val gradle = "com.android.tools.build:gradle:${Ver.gradle}"
    //kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Ver.kotlin}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Ver.kotlin}"

    //android ui
    const val appcompat = "androidx.appcompat:appcompat:${Ver.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Ver.coreKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Ver.constraintLayout}"
    const val material = "com.google.android.material:material:${Ver.material}"


    //test libs
    const val junit = "junit:junit:${Ver.junit}"
    const val extJUnit = "androidx.test.ext:junit:${Ver.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Ver.espresso}"
}