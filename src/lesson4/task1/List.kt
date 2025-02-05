@file:Suppress("UNUSED_PARAMETER", "ConvertCallChainIntoSequence")

package lesson4.task1

import lesson1.task1.discriminant
import kotlin.math.sqrt

// Урок 4: списки
// Максимальное количество баллов = 12
// Рекомендуемое количество баллов = 8
// Вместе с предыдущими уроками = 24/33

/**
 * Пример
 *
 * Найти все корни уравнения x^2 = y
 */
fun sqRoots(y: Double) =
    when {
        y < 0 -> listOf()
        y == 0.0 -> listOf(0.0)
        else -> {
            val root = sqrt(y)
            // Результат!
            listOf(-root, root)
        }
    }

/**
 * Пример
 *
 * Найти все корни биквадратного уравнения ax^4 + bx^2 + c = 0.
 * Вернуть список корней (пустой, если корней нет)
 */
fun biRoots(a: Double, b: Double, c: Double): List<Double> {
    if (a == 0.0) {
        return if (b == 0.0) listOf()
        else sqRoots(-c / b)
    }
    val d = discriminant(a, b, c)
    if (d < 0.0) return listOf()
    if (d == 0.0) return sqRoots(-b / (2 * a))
    val y1 = (-b + sqrt(d)) / (2 * a)
    val y2 = (-b - sqrt(d)) / (2 * a)
    return sqRoots(y1) + sqRoots(y2)
}

/**
 * Пример
 *
 * Выделить в список отрицательные элементы из заданного списка
 */
fun negativeList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (element in list) {
        if (element < 0) {
            result.add(element)
        }
    }
    return result
}

/**
 * Пример
 *
 * Изменить знак для всех положительных элементов списка
 */
fun invertPositives(list: MutableList<Int>) {
    for (i in 0 until list.size) {
        val element = list[i]
        if (element > 0) {
            list[i] = -element
        }
    }
}

/**
 * Пример
 *
 * Из имеющегося списка целых чисел, сформировать список их квадратов
 */
fun squares(list: List<Int>) = list.map { it * it }

/**
 * Пример
 *
 * Из имеющихся целых чисел, заданного через vararg-параметр, сформировать массив их квадратов
 */
fun squares(vararg array: Int) = squares(array.toList()).toTypedArray()

/**
 * Пример
 *
 * По заданной строке str определить, является ли она палиндромом.
 * В палиндроме первый символ должен быть равен последнему, второй предпоследнему и т.д.
 * Одни и те же буквы в разном регистре следует считать равными с точки зрения данной задачи.
 * Пробелы не следует принимать во внимание при сравнении символов, например, строка
 * "А роза упала на лапу Азора" является палиндромом.
 */
fun isPalindrome(str: String): Boolean {
    val lowerCase = str.lowercase().filter { it != ' ' }
    for (i in 0..lowerCase.length / 2) {
        if (lowerCase[i] != lowerCase[lowerCase.length - i - 1]) return false
    }
    return true
}

/**
 * Пример
 *
 * По имеющемуся списку целых чисел, например [3, 6, 5, 4, 9], построить строку с примером их суммирования:
 * 3 + 6 + 5 + 4 + 9 = 27 в данном случае.
 */
fun buildSumExample(list: List<Int>) = list.joinToString(separator = " + ", postfix = " = ${list.sum()}")

/**
 * Простая (2 балла)
 *
 * Найти модуль заданного вектора, представленного в виде списка v,
 * по формуле abs = sqrt(a1^2 + a2^2 + ... + aN^2).
 * Модуль пустого вектора считать равным 0.0.
 */
fun abs(v: List<Double>): Double = TODO()

/**
 * Простая (2 балла)
 *
 * Рассчитать среднее арифметическое элементов списка list. Вернуть 0.0, если список пуст
 */
fun mean(list: List<Double>): Double {
    val sum = list.sum()
    val a = list.size
    if (a > 0) {
        return (sum / a)
    } else {
        return 0.0
    }
}

/**
 * Средняя (3 балла)
 *
 * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
 * Если список пуст, не делать ничего. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
fun center(list: MutableList<Double>): MutableList<Double> {
<<<<<<< .merge_file_a03636
    var b = 0.0
    if (list.isNotEmpty()) b = list.sum() / list.size
    if (list.isNotEmpty()) {
        for (ch1 in 0 until list.size)
            list[ch1] = list[ch1] - b
    }
    return list
}
=======

    val meanResult = mean(list)
    for (i in 0 until list.size) {
        list[i]
        list[i] = list[i] - meanResult

    }
    return list
}

>>>>>>> .merge_file_a10884

/**
 * Средняя (3 балла)
 *
 * Найти скалярное произведение двух векторов равной размерности,
 * представленные в виде списков a и b. Скалярное произведение считать по формуле:
 * C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.
 */
fun times(a: List<Int>, b: List<Int>): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Рассчитать значение многочлена при заданном x:
 * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
 * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
 * Значение пустого многочлена равно 0 при любом x.
 */
fun polynom(p: List<Int>, x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * В заданном списке list каждый элемент, кроме первого, заменить
 * суммой данного элемента и всех предыдущих.
 * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
 * Пустой список не следует изменять. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
fun accumulate(list: MutableList<Int>): MutableList<Int> {
    for (i in 1 until list.size) {
        list[i] = list[i - 1] + list[i]
    }
    return list
}

/**
 * Средняя (3 балла)
 *
 * Разложить заданное натуральное число n > 1 на простые множители.
 * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
 * Множители в списке должны располагаться по возрастанию.
 */
fun factorize(n: Int): List<Int> {
    var del = 2
    val list = mutableListOf<Int>()
    var q = n
    while (q > 1) {
        while (q % del == 0) {
            list.add(del)
            q /= del

        }
        del += 1
    }
    list.sorted()
    return list
}

/**
 * Сложная (4 балла)
 *
 * Разложить заданное натуральное число n > 1 на простые множители.
 * Результат разложения вернуть в виде строки, например 75 -> 3*5*5
 * Множители в результирующей строке должны располагаться по возрастанию.
 */
fun factorizeToString(n: Int): String {
<<<<<<< .merge_file_a03636
    val x = mutableListOf<Int>()
    var ch1 = n
    for (del in 2..n) {
        if (ch1 % del == 0)
            while (ch1 % del == 0) {
                x.add(del)
                ch1 /= del
            }
    }
    return x.joinToString(separator = "*")
=======
    val listresult = factorize(n)
    return listresult.joinToString(separator = "*")
>>>>>>> .merge_file_a10884
}

/**
 * Средняя (3 балла)
 *
 * Перевести заданное целое число n >= 0 в систему счисления с основанием base > 1.
 * Результат перевода вернуть в виде списка цифр в base-ичной системе от старшей к младшей,
 * например: n = 100, base = 4 -> (1, 2, 1, 0) или n = 250, base = 14 -> (1, 3, 12)
 */
fun convert(n: Int, base: Int): List<Int> = TODO()

/**
 * Сложная (4 балла)
 *
 * Перевести заданное целое число n >= 0 в систему счисления с основанием 1 < base < 37.
 * Результат перевода вернуть в виде строки, цифры более 9 представлять латинскими
 * строчными буквами: 10 -> a, 11 -> b, 12 -> c и так далее.
 * Например: n = 100, base = 4 -> 1210, n = 250, base = 14 -> 13c
 *
 * Использовать функции стандартной библиотеки, напрямую и полностью решающие данную задачу
 * (например, n.toString(base) и подобные), запрещается.
 */
fun convertToString(n: Int, base: Int): String = TODO()

/**
 * Средняя (3 балла)
 *
 * Перевести число, представленное списком цифр digits от старшей к младшей,
 * из системы счисления с основанием base в десятичную.
 * Например: digits = (1, 3, 12), base = 14 -> 250
 */
fun decimal(digits: List<Int>, base: Int): Int = TODO()

/**
 * Сложная (4 балла)
 *
 * Перевести число, представленное цифровой строкой str,
 * из системы счисления с основанием base в десятичную.
 * Цифры более 9 представляются латинскими строчными буквами:
 * 10 -> a, 11 -> b, 12 -> c и так далее.
 * Например: str = "13c", base = 14 -> 250
 *
 * Использовать функции стандартной библиотеки, напрямую и полностью решающие данную задачу
 * (например, str.toInt(base)), запрещается.
 */
fun decimalFromString(str: String, base: Int): Int = TODO()

/**
 * Сложная (5 баллов)
 *
 * Перевести натуральное число n > 0 в римскую систему.
 * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
 * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
 * Например: 23 = XXIII, 44 = XLIV, 100 = C
 */
<<<<<<< .merge_file_a03636
fun roman(n: Int): String {
    var result = ""
    var ch = n
    val rimch = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val rimsimvol = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    var i = 0
    while (ch > 0) {
        while (ch - rimch[i] >= 0) {
            result += rimsimvol[i]
            ch -= rimch[i]
        }
        i += 1

    }
    return result


=======
val romNumb = listOf(
    1000,
    900,
    500,
    400,
    100,
    90,
    50,
    40,
    10,
    9,
    5,
    4,
    1
)
val romAbc = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
fun roman(n: Int): String {
    var str = ""
    var n1 = n
    var i = 0
    while (n1 > 0) {
        while (n1 - romNumb[i] >= 0) {
            str += romAbc[i]
            n1 -= romNumb[i]
        }
        i += 1
    }
    return str
>>>>>>> .merge_file_a10884
}

/**
 * Очень сложная (7 баллов)
 *
 * Записать заданное натуральное число 1..999999 прописью по-русски.
 * Например, 375 = "триста семьдесят пять",
 * 23964 = "двадцать три тысячи девятьсот шестьдесят четыре"
 */

fun russian(n: Int): String {
    val thousandsUnitsMap = mapOf<Int, String?>(
        1 to "одна",
        2 to "две",
        3 to "три",
        4 to "четыре",
        5 to "пять",
        6 to "шесть",
        7 to "семь",
        8 to "восемь",
        9 to "девять"
    )

    val tensMap = mapOf<Int, String?>(
        2 to "двадцать",
        3 to "тридцать",
        4 to "сорок",
        5 to "пятьдесят",
        6 to "шестьдесят",
        7 to "семьдесят",
        8 to "восемьдесят",
        9 to "девяносто"
    )

    val exceptionalTensMap = mapOf<Int, String?>(
        10 to "десять",
        11 to "одиннадцать",
        12 to "двенадцать",
        13 to "тринадцать",
        14 to "четырнадцать",
        15 to "пятнадцать",
        16 to "шестнадцать",
        17 to "семнадцать",
        18 to "восемнадцать",
        19 to "девятнадцать"
    )

    val hundredsMap = mapOf<Int, String?>(
        1 to "сто",
        2 to "двести",
        3 to "триста",
        4 to "четыреста",
        5 to "пятьсот",
        6 to "шестьсот",
        7 to "семьсот",
        8 to "восемьсот",
        9 to "девятьсот"
    )

    val unitsMap = mapOf<Int, String?>(
        1 to "один",
        2 to "два",
        3 to "три",
        4 to "четыре",
        5 to "пять",
        6 to "шесть",
        7 to "семь",
        8 to "восемь",
        9 to "девять"
    )

    val thousandWordByUnitMap = mapOf<Int, String?>(
        1 to "тысяча",
        2 to "тысячи",
        3 to "тысячи",
        4 to "тысячи",
        5 to "тысяч",
        6 to "тысяч",
        7 to "тысяч",
        8 to "тысяч",
        9 to "тысяч",
        0 to "тысяч"
    )

    var outputString = ""

    val hundredThousands = n / 100000
    val tensThousands = (n % 100000) / 10000
    val unitsThousands = (n % 10000) / 1000
    val hundreds = (n % 1000) / 100
    val tens = (n % 100) / 10
    val units = n % 10

    hundredsMap[hundredThousands]?.let { outputString += "$it " }

    if (tensThousands == 1) {
        val tensAndUnitsThousands = tensThousands * 10 + unitsThousands
        exceptionalTensMap[tensAndUnitsThousands]?.let {
            outputString += "$it тысяч "
        }
    } else {
        tensMap[tensThousands]?.let { outputString += "$it " }
        thousandsUnitsMap[unitsThousands]?.let { outputString += "$it " }
        thousandWordByUnitMap[unitsThousands]?.let { if (outputString.isNotEmpty()) outputString += "$it " }
    }

    hundredsMap[hundreds]?.let { outputString += "$it " }

    if (tens == 1) {
        val tensAndUnits = tens * 10 + units
        exceptionalTensMap[tensAndUnits]?.let {
            outputString += "$it "
        }
    } else {
        tensMap[tens]?.let { outputString += "$it " }
        unitsMap[units]?.let { outputString += "$it " }
    }


    return outputString.trim()

}