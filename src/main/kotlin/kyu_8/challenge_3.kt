package kyu_8

import java.util.Locale

//  my solution
fun makeUpperCase(str: String): String {
    return str.uppercase(locale = Locale.getDefault())
}

fun main() {
    println(makeUpperCase("ken"))
}