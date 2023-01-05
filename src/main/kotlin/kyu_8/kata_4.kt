package kyu_8

fun invert(arr: IntArray): IntArray {
    // code here
    //  mapping the values
    return arr.map { it * -1 }.toIntArray()
}

fun main() {
    println(invert(intArrayOf(3, -3, 5, 6)).toList())
}