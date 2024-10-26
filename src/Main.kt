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
    for (row in array) {
        println(row.joinToString(" "))
    }
    // Подсчет цифр
    val а = mutableSetOf<Char>()
    for (row in array) {
        for (number in row) {
            а.addAll(number.toString().toCharArray().toSet())
        }
    }
    println("В массиве использовано ${а.size} различных цифр")
}