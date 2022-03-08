@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

<<<<<<< .merge_file_a12228
import lesson1.task1.sqr
import kotlin.math.max
import kotlin.math.min
=======
import kotlin.math.pow
>>>>>>> .merge_file_a10912
import kotlin.math.sqrt

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result *= i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
<<<<<<< .merge_file_a12228
    var number = n
    var result = 0
    if (number == 0){
        result = 1
    }
    while (number!=0){
        number/=10
        result+=1
    }
    return  result
}

=======
    var count: Int
    var m = n
    if (n < 0) m *= -1
    count = if (m == 0) 1 else 0
    while (m > 0) {
        m /= 10
        count += 1
    }
    return count

}
>>>>>>> .merge_file_a10912

/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
    var fib1 = 1
    var fib2 = 1
<<<<<<< .merge_file_a12228
    var k = 0
    while (k < n - 2) {
        val sumfib = fib1 + fib2
        fib1 = fib2
        fib2 = sumfib
        k += 1
=======
    for (i in 0..(n - 3)) {
        val fibSum = fib1 + fib2
        fib1 = fib2
        fib2 = fibSum
>>>>>>> .merge_file_a10912
    }
    return fib2
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int = TODO()

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int = TODO()

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int {
    for (k in max(n, m)..n * m step (max(n, m))) {
        if ((k % n == 0) && (k % m == 0)) return k
    }
    return m * n
}

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean {
    for (c in 2..min(m, n)) {
        if ((n % c == 0) && (m % c == 0)) return false

<<<<<<< .merge_file_a12228
    }
    return true
}

=======
>>>>>>> .merge_file_a10912
/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var count = n
    var result = 0
    while (count > 0) {
        result = result * 10 + count % 10
        count /= 10
    }
    return result
}

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean {
    return (revert(n)) == n
}


/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean = TODO()



/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int {
<<<<<<< .merge_file_a12228
    var sumkv = 0
    var k = 1
    var s = n
    while (s > 0) {
        sumkv = sqr(k)
        s -= digitNumber(sumkv)
        k += 1
    }
    if (s < 0) while (s != 0) {
        sumkv /= 10
        s += 1
    }
    return sumkv % 10
=======
    var temp = 1
    var count = n
    var result = 0
    while (count > 0) {
        result = temp * temp
        temp += 1
        count -= digitNumber(result)

    }
    if (count < 0) while (count != 0) {
        count += 1
        result /= 10

    }
    return result % 10
>>>>>>> .merge_file_a10912

}

/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
    if (n < 3) return 1
<<<<<<< .merge_file_a12228
    var fib1 = 1
    var fib2 = 1
    var k = n - 2
    var sumfib = 0
    while (k > 0) {
        sumfib = fib1 + fib2
        fib1 = fib2
        fib2 = sumfib
        k -= digitNumber(sumfib)
    }
    if (k < 0) while (k != 0) {
        sumfib /= 10
        k += 1
    }
    return sumfib % 10
}
=======
    var prev1 = 1
    var prev2 = 1
    var count = n - 2
    var result = 0
    while (count > 0) {
        result = prev1 + prev2
        prev1 = prev2
        prev2 = result
        count -= digitNumber(result)
    }
    if (count < 0) while (count != 0) {
        result /= 10
        count += 1
    }
    return result % 10
}
>>>>>>> .merge_file_a10912
