fun main() {
    val names = arrayOf("Bintang", "Budi","Joko")

    var total = 0;
    for (name in names) {
        println(name)
        total++
    }
    println("Total = $total ")

    val ukuranArray = names.size-1

    for (i in 0..ukuranArray ){
        println("indeks ke = $i")
    }

}