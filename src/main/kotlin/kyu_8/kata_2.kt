package kyu_8

//  my solution
fun summation(num: Int): Int {
    var sum = 0

    for (i in 1 .. num) {
        sum += i
        println(sum)
    }

    return sum
}

//  other solutions
fun summation_alt1(num: Int) = (1..num).sum()

fun summation_alt_2(num: Int) = num.downTo(0).reduce { acc, i ->
    acc + i
}


fun main() {
    println(summation(8))
}