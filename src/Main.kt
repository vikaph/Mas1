fun main() {
    println("Введите количество строк:")
    val m = readLine()?.toIntOrNull() ?: return
    println("Введите количество столбцов:")
    val n = readLine()?.toIntOrNull() ?: return

    val array = Array(m) { IntArray(n) }

    println("Введите ${m * n} трехзначных чисел (числа могут повторяться):")
    for (i in 0 until m) {
        for (j in 0 until n) {
            var number: Int
            do {
                number = readLine()!!.toInt()
                if (number < 100 || number > 999) {
                    println("Пожалуйста, введите трехзначное число:")
                }
            } while (number < 100 || number > 999)
            array[i][j] = number
        }
    }
    println("Двумерный массив:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${array[i][j]} ")
        }
        println()
    }
    // Подсчет цифр
    val a = mutableSetOf<Char>()
    for (i in 0 until m) {
        for (j in 0 until n) {
            val numberString = array[i][j].toString()
            for (digit in numberString) {
                a.add(digit) }
        }
    }
        println("В массиве использовано ${a.size} различных цифр")
}