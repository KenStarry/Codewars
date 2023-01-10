package kyu_8

class ParseIntCharProblem {

    fun getAge(yearsOld: String): Int = yearsOld.first().toString().toInt()
    fun getAge1(yearsOld: String): Int = yearsOld.first().digitToInt()
    fun getAge2(yearsOld: String): Int = yearsOld.take(1).toInt()

}