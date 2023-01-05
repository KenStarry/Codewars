package kyu_8

//  my solution
fun include(arr: IntArray, item : Int): Boolean = arr.contains(item)

//  other solutions
fun include_alt_1(arr: IntArray, item : Int): Boolean = item in arr
fun include_alt_2(arr: IntArray, item : Int): Boolean = arr.any { it == item }

fun main() {
    println(include(intArrayOf(1, 2, 3, 4), 78))
}