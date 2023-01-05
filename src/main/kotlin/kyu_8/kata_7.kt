package kyu_8

class SmallestIntegerFinder {

    fun findSmallestInt(nums: List<Int>): Int {
        var min = nums[0]

        nums.forEach {
            if (it < min)
                min = it
        }

        return min
    }

    //  other solutions
    //  minOf Operator
    fun smallestInt(nums: List<Int>): Int = nums.minOf { it }

    //  sorting first then get the first element
    fun smallestInt2(nums: List<Int>): Int = nums.sorted()[0]

}