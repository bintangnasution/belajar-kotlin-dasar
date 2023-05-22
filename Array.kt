fun main() {
    val members:Array<String> = arrayOf("Bintang","Lambang", "Cholis")
    val values:Array<Byte> = arrayOf(100,90,95)
    val balance:Array<Int> = arrayOf(10_000,20_000,30_000)

    values.set(2,89)
    println(members[members.size-1])
    println(values[2])


//    nullable array
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0,"Bintang")
    names.set(1,null)
    names.set(2,"Lambang")
    names.set(3,null)
    names.set(4,"Cholis")

    println(names[0])
    println(names[1])


}