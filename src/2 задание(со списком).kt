fun main() {
        val number = readLine()!!.split(" ").map { it.toInt() }
        println(number.maxOrNull())

    }
