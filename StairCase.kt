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


fun stairCase(n: Int): String {
    var stairCase: String = ""
    
    for (x in 1 until n + 1) {
        for (y in 0 until n - x) {
           stairCase += " "
        }
        
        for (y in 0 until x) {
           stairCase += "#"
        }
        
        stairCase += "\n"
    }
    
    return stairCase
}


fun main() {
    print("Size of staircase: ")
    val n = readLine()!!.trim().toInt()
    val result = stairCase(n)
    println("The staircase of size $n!")
    println(result)
}
