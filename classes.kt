class Dog(val Name: String, var weight: Int, val breed: String) {

   init {
       println("$Name is initialized") // this function will be called when the object is initialized immediately
   }

    fun info() {
        println("The name is $Name and the weight is $weight and the breed is $breed")
    }

    init {
        println("$Name  2nd initialized")
    }

}


fun main(){

    val myDog = Dog("doggo",34,"jaimy")
    myDog.info()
    lateinit var str : String // The lateinit keyword allows you to avoid initializing a property when an object is constructed

    val dogs = arrayOf(Dog("abc",123,"wer"),Dog("qaz",345,"plm")) //  used to declare an array of objects
    dogs[0].info()
    dogs[1].info()
    
}