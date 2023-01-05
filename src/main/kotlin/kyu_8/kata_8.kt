package kyu_8

//  using reduce
fun grow(arr: IntArray): Int = arr.reduce { acc, i ->
    acc * i
}

//  using fold
fun grow2(arr: IntArray): Int = arr.fold(arr[0]) {acc, next ->
    acc * next
}

fun main() {
    println(grow2(intArrayOf(1, 2, 3, 4)))
}