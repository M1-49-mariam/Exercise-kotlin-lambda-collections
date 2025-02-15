fun processNumbers(numbers: List<Int>) : List<Int>{
    val filterOddNumbers = { number1: Int -> number1 % 2 == 0}
    val squareNumbers = { number2: Int -> number2 * number2 }
    return numbers.filter(filterOddNumbers).map(squareNumbers)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20)

    println(processNumbers(numbers))

}