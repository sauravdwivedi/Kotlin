/** Kotlin script to print "Fizz" if a number is divisible by 3, print 
 *  "Buzz" if a number is divisible by 5, and print "FizzBuzz" if a number 
 *  is divisible by both 3 and 5 for numbers in a given range.
 */
 
 fun fizzBuzz(targetNum: Int): Unit {
     for (x in 1 until targetNum + 1) {
         if ((x % 3 == 0) && (x % 5 == 0)) {
             println("FizzBuzz")
         }
         else if (x % 3 == 0) {
             println("Fizz")
         }
         else if (x % 5 == 0) {
             println("Buzz")
         }
         else {
             println(x)
         }
     }
 }
 
 fun main() {
     println("Enter range of numbers: ")
     var targetNum = readLine()!!.trim().toInt()
     fizzBuzz(targetNum)
 }
