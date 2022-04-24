/** A staircase of size (say n = 5) is combination of white spaces and #:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 *
 *  where number of #'s at bottom is equal to n. Whrite a method to print
 *  a staircase for a given integer n as input.
 */

fun stairCase(stairCaseSize: Int): String {
    var stairCase: String = ""
    for (i in 1 until stairCaseSize + 1) {
        for (j in 0 until stairCaseSize - x) {
           stairCase += " "
        }
        for (k in 0 until x) {
           stairCase += "#"
        }
        stairCase += "\n"
    }
    return stairCase
}

fun main() {
    print("Size of staircase: ")
    val stairCaseSize = readLine()!!.trim().toInt()
    val result = stairCase(stairCaseSize)
    println("The staircase of size $stairCaseSize!")
    println(result)
}
