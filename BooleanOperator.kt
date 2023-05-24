fun main() {
//    Boolean Operator &&, ||, !
    val finalExam = 80
    val attendant = 75
    val extra = 80

    val passFinalExam = finalExam > 75
    val passAttendant = attendant >80
    val passExtra = extra>75

    val pass = passFinalExam && passAttendant && passExtra

    println(pass)
}