/** Consider the following version of Bubble Sort:
 *  for (int i = 0; i < n; i++) {
 *    for (int j = 0; j < n - 1; j++) {
 *      // Swap adjacent elements if they are in decreasing order
 *      if (a[j] > a[j + 1]) {
 *          swap(a[j], a[j + 1]);
 *      }
 *    }
 *  }
 *  Given an array of integers, sort the array in ascending order using
 *  the Bubble Sort algorithm above. Once sorted, print the following
 *  three lines:
 *
 *  Array is sorted in numSwaps swaps., where numSwaps is the number of
 *  swaps that took place.
 *
 *  First Element: firstElement, where firstElement is the first element
 *  in the sorted array.
 *
 *  Last Element: lastElement, where lastElement is the last element in
 *  the sorted array.
 *
 *  Hint: To complete this challenge, you must add a variable that keeps
 *  a running tally of all swaps that occur during execution.
 */
 

fun bubbleSort(arrayInt: MutableList<Int>): Unit {
    /** Method to count number of swaps to sort the array */
    var numSwaps = 0
    for (i in 0 until arrayInt.size) {
        for (j in 0 until arrayInt.size - 1) {
            if (arrayInt[j] > arrayInt[j+1]) {
                val left = arrayInt[j]
                arrayInt[j] = arrayInt[j+1] 
                arrayInt[j+1] = left
                numSwaps += 1
            }
        }
    }
    println("Sorted array: [${arrayInt.joinToString(",")}]")
    println("Array is sorted in $numSwaps swaps.")
    println("First element: ${arrayInt[0]}")
    println("Last element: ${arrayInt[arrayInt.size-1]}")
}
  
fun main() {
    println("Enter array of integers (space separated e.g. '1 2 3'): ")
    val arrayInt = readLine()!!.trim().split(" ").map{it.toInt()}.toMutableList()
    println("Given array: [${arrayInt.joinToString(",")}]")
    bubbleSort(arrayInt)
}


