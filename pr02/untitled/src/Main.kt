fun main() {
    // Тестирование функции для разных месяцев
    println("=== Определение времени года по номеру месяца ===\n")

    val testMonths = listOf(1, 3, 6, 9, 12, 0, 13)

    for (month in testMonths) {
        determineSeason(month)
    }

    // Демонстрация всех месяцев
    println("\n=== Все времена года ===")
    for (month in 1..12) {
        val season = getSeasonName(month)
        println("Месяц $month - $season")
    }
}

/**
 * Функция для определения времени года по номеру месяца
 * с использованием конструкции when
 */
fun determineSeason(month: Int) {
    val season = when (month) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Неверный номер месяца"
    }

    if (month in 1..12) {
        println("Месяц №$month: $season")
    } else {
        println("Ошибка: $season (должен быть от 1 до 12)")
    }
}

/**
 * Альтернативная реализация с использованием if/else
 * и возвращаемым значением
 */
fun getSeasonName(month: Int): String {
    return if (month in 1..12) {
        when (month) {
            12, 1, 2 -> "Зима"
            3, 4, 5 -> "Весна"
            6, 7, 8 -> "Лето"
            9, 10, 11 -> "Осень"
            else -> "" // Этот случай никогда не произойдет из-за проверки выше
        }
    } else {
        "Неверный номер месяца"
    }
}