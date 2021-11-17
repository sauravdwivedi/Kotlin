/** A left rotation operation on an array shifts each of the array's
 *  elements 1 unit to the left. For example, if 2 left rotations are
 *  performed on array [1,2,3,4,5], then the array would become
 *  [3,4,5,1,2]. Note that the lowest index item moves to the highest
 *  index in a rotation. This is called a circular array.
 *
 *  Given an array a of n integers and a number, d, perform d left
 *  rotations on the array. Return the updated array to be printed
 *  as a single line of space-separated integers.
 */

class LeftRotation {
    fun oneLeftRot(a: MutableList<Int>): MutableList<Int> {
        var x = mutableListOf<Int>()
        for (j in 0 until a.size) {
            if (j < a.size-1) {
                x.add(a[j+1])
            }
            else {
                x.add(a[0])
            }
        }
    return x
    }

    fun main() {
        println("Length of array: ")
        val n = readLine()!!.trim().toInt()
        var a = mutableListOf<Int>()
        for (i in 0 until n){
            println("Entry: ")
            a.add(readLine()!!.trim().toInt())
        }
        println("Enter no. of rotations: ")
        val d = readLine()!!.trimEnd().toInt()
        var c = 0
        while (c < d) {
            var z = oneLeftRot(a)
            c = c + 1
            a = z
        }
        println("Array after $d rotations: [${a.joinToString(",")}]")
    }
}
