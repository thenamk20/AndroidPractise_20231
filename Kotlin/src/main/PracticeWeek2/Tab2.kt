fun main(args: Array<String>){
    //
    val isUnit = println("This is an expression")
    println(isUnit)

    //
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    //
    val message = "The water temperature is ${  if(temperature > 50) "to warm" else "OK" }."
    println(message)

    //note: loops are exception to "everything has a value"
}