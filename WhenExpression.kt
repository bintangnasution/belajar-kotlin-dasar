fun main() {
    val finalExam = 'B'

    when(finalExam){
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Try again")

        }
    }
// Group when expression
    when(finalExam){
        'A','B','C' -> {
            println("Selamat Anda Lulus")
        }
        else ->{
            println("Maaf Anda tidak Lulus")
        }
    }
//    When Expression with in and !in
    val passValues = arrayOf('A','B','C')
    when (finalExam){
        in passValues -> println("Pass")
        !in passValues -> println("Try Again")
    }

    val nama= "Bintang"
    when(nama){
        is String ->println("Name is string")
        !is String ->println("Name isn't string")
    }
//    when with operator
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60  -> println("Not Bad")
        else -> println("Ngulang tahun")

    }
}