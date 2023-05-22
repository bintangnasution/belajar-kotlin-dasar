fun main() {
    var firstname: String = "Bintang"
    var lastname:String = "Nasution"
    var address:String = """
        >Jalan Belum Jadi
        >Kab. Banguntapan
        >Jawa Tengah
        >Indonesia
    """.trimMargin(">")
    var fullname:String = "$firstname $lastname"
    var desc:String = "$fullname length = ${fullname.length}"

    println(firstname)
    println(lastname)
    println(address)
    println(desc)

}