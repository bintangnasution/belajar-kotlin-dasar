fun main() {
    val range1 = 1..100
    val range2 = 100 downTo 1

    val range3 = 100 downTo  1 step 2

    println(range1.count())
    println(range1.contains(50))
    println(range1.contains(200))
    println(range1.first)
    println(range1.step)
    println(range1.last)

    println()

    println(range2.count())
    println(range2.contains(50))
    println(range2.contains(200))
    println(range2.first)
    println(range2.step)
    println(range2.last)

    println()

    println(range3.count())
    println(range3.contains(50))
    println(range3.contains(200))
    println(range3.first)
    println(range3.step)
    println(range3.last)


}