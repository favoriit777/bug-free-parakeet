fun main() {
    val twoDigitNumber = 57
    val sumOfDigits = calculateSumOfDigits(twoDigitNumber)
    println("Двухзначное число: $twoDigitNumber")
    println("Сумма его цифр: $sumOfDigits")

    // Дополнительные примеры для демонстрации
    println("\nДополнительные примеры:")
    println("Число 42: сумма цифр = ${calculateSumOfDigits(42)}")
    println("Число 91: сумма цифр = ${calculateSumOfDigits(91)}")
    println("Число 10: сумма цифр = ${calculateSumOfDigits(10)}")
}

fun calculateSumOfDigits(number: Int): Int {
    // Проверяем, что число действительно двухзначное (от 10 до 99)
    if (number < 10 || number > 99) {
        println("Внимание: число $number не является двухзначным!")
    }

    val tens = number / 10      // Получаем первую цифру (десятки)
    val ones = number % 10      // Получаем вторую цифру (единицы)

    return tens + ones
}