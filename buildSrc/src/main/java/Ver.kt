//version constants for the Kotlin DSL dependencies
object Ver {
    //app level
    const val gradle = "4.1.2"
    const val kotlin = "1.4.31"

    //libs
    object Ui {
        const val coreKtx = "1.2.0"
        const val appcompat = "1.2.0"
        const val constraintLayout = "1.1.3"
        const val material = "1.3.0"
    }

    //test
    object Test {
        const val junit = "4.13.2"
        const val extJunit = "1.1.2"
        const val espresso = "3.3.0"
    }
}