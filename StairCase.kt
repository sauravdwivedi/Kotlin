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

class StairCase(var stairCase: String = "") {
    
    fun stairCase(stairCaseSize: Int): String {
        for (i in 1 until stairCaseSize + 1) {
            for (j in 0 until stairCaseSize - i) {
                this.stairCase += " "
            }
            for (k in 0 until i) {
               this.stairCase += "#"
            }
            this.stairCase += "\n"
        }
        return this.stairCase
    }
}
    
fun main() {
    print("Size of staircase: ")
    val stairCaseSize = readLine()!!.trim().toInt()
    val obj = StairCase()
    val result = obj.stairCase(stairCaseSize)
    println("The staircase of size $stairCaseSize!")
    println(result)
}
