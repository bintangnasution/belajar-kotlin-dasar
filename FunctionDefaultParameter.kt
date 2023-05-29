fun hello(firstname:String,lastname:String? = null){
    if (lastname == null){
        println("Hello $firstname")
    }else{
        println("Hello $firstname $lastname")
    }


}
fun main() {
    hello("Bintang")
    hello("Bintang", "Nasution")
}