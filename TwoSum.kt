/** Write a method that checks if there is at least one pair of
 *  numbers which sum equals target. arr=[1, 3, 4] and target=5
 *  result is true because the pair (1,4) sums to five.
 */
 
fun twoSum(arrayInt: List<Int>, targetInt: Int): String {
    var result = false
    for (p in arrayInt) {
        for (q in arrayInt) {
            if ((p != q) && (p+q == targetInt)) {
            result = true
            }
        }
    }
    if (result == true) {
        return "At least one pair has sum equal to $targetInt!"
    }
    else {
        return "No pair has sum equal to $targetInt!"
    }
}

fun main() {
    println("Enter array of integers (space separated e.g. '1 2 3'): ")
    val arrayInt = readLine()!!.trim().split(" ").map{it.toInt()}.toList()
    println("Target: ")
    val targetInt = readLine()!!.toInt()
    println(twoSum(arrayInt, targetInt))
}

