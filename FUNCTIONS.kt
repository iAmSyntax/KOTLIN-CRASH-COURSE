fun param(param: Int) { // parameter types must be specified
    println("PARAMETER IS $param")
}

fun adds(a: Int, b: Int): Int {
    return a + b;
}


fun muls(a: Int, b: Int): Double = (a * b).toDouble() // to reduce code length
fun divide(a: Int, b: Int) =
    if (b != 0) a / b else "Division by zero is not possible" // the function will detect what is
// to be returned to


fun main() {

    param(45)
    println(adds(2, 3))
    println(muls(23345, 45))
    println(divide(23, 0))

    var name = "HELLO" // since this is var the variable can be modified else the variable cant be modified
    println("the string is $name")
    name = "james"
    println("the string is $name")
    name = 234.56.toString()
    println("the number is $name") // the data type will remain same
    var x = 0
    while (x in 0..100) {
        x += 1
        //  print(x+" ") error
        print("$x  ")
    }
print("\n")
    for (x in 100..200){
        print(x)
    }
print("\n")

    var firstName = readln()
    var no : Int = firstName.toInt()
    println("The number is $no")

    


}

