fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val operation = readLine()
    val results = when (operation){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> 1.0 * a / b
        else -> "ошибка"
    }

    println("результат: $results")
}
