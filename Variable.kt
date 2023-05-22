// Constant
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
//    Mutable
    var firstname:String ="Bintang"
//    Immutable
    val lastname = "Nasution"
//    Nullable
    var namadepan:String? = null
    namadepan = "Bintang"
    println(namadepan)
    println(namadepan?.length)

    println("$APP : $VERSION")

}