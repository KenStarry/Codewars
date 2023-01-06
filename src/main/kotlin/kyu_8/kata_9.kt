package kyu_8

fun repeatStr(r: Int, str: String) : String {

    var myString = ""
    for (i in 0 until r) {
        myString += str
    }
    return myString
}

//  other answers
fun repeatStr2(r: Int, str: String): String = str.repeat(r)