// A function that uses lambdas as its parameters is called higher-order function
fun convert(x:Double,converter:(Double) -> Double) :Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result;
}
typealias DS = (Double) -> Double // this is giving another name to that type of lambdas

fun units (converter: (Double) -> Unit) {} // If unit is used then it means there is no return type

fun convertsFive(converter: (Double) -> Double) : Double{
    return converter(5.0)
}

fun getConversions (str:String) : (Double) -> Double{

    if (str == "ONE") {
        return {it *12}
    } else if (str == "TWO") {
        return {it *13}
    } else {
        return {it}
    }

}

fun combine (l1 : (Double)-> Double,l2:(Double) -> Double) : (Double) -> Double{

    return {x:Double->l2(l1(x))}

}



fun main(){

    {x:Int -> x+5 } // the left of -> is called lambdas parameter , the right of -> is called the body
   // the above lambda is the equivalent of the following  fun add5(x:Int) = x+5
    val addNums = {x :Int , y :Int -> x+y}
    println(addNums(3,4)) // invoking the lambdas

    // lambdas type takes the form () -> return type
    // val msg = {x:Int -> "The value is $x"} its type is (Int) -> String
    val greetings : (Int) -> String = {x ->"Hello the number is $x"} // here the type of x is already known because
                                                                    // but since the declaration exist the compiler knows what x is of
    val testLamdas :(Int,String) -> String = {x,y -> "Hello $x and $y"}
    println(testLamdas(23,"45"))

    val single : (String) -> String ={" $it since only parameter  "}



    println(    convert(20.0,{c:Double -> c*1.8+32})    )
    convert(20.0)     { c: Double -> c * 1.8 + 32 } // if the final parameter is a lambda then the argument can be outside

    convertsFive { x:Double -> x*67.0 } // if the parameter contains only lambdas
    println(    convertsFive { x:Double -> x*67.0 }
    )

    println(getConversions("ONE")(12.0)) // calling functions that return lambdas

    convert(20.0,getConversions("ONE")) // THIS TOO IS POSSIBLE

    val s1 : (Double) -> Double = {x -> x*4} // this is about a function whose parameters as well as return
    val s2 : (Double) -> Double = {y -> y*6} // types are lambdas

    val s1S2 = combine(s1,s2)

    val endRes = s1S2(200.0)
    println(endRes)


    // now we can make the code more readable

}