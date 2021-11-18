/** Each time Sunny and Johnny take a trip to the Ice Cream Parlor,
 *  they pool their money to buy ice cream. On any given day, the parlor
 *  offers a line of flavors. Each flavor has a cost associated with it.
 *  Given the value of money and the cost of each flavor for t trips to
 *  the Ice Cream Parlor, help Sunny and Johnny choose two distinct
 *  flavors such that they spend their entire pool of money during each
 *  visit. ID numbers are the 1-based index number associated with a
 *  cost. For each trip to the parlor, print the ID numbers for the two
 *  types of ice cream that Sunny and Johnny purchase as two
 *  space-separated integers on a new line. You must print the smaller
 *  ID first and the larger ID second.
 */

import java.io.File
import java.util.Collections

fun iceCream(cost: List<Int>, money: Int): String {
    var z = mutableListOf<String>()
    for (i in 1 until cost.size) {
        for (j in i+1 until cost.size) {
            if (cost[i-1] + cost[j-1] == money) {
                z.add("$i $j")
            }
        }
    }
    Collections.sort(z)
    return z.joinToString(" ")
}

fun main() {
    try {
        val inputFile = "IceCreamParlor_input.txt"
        var lines = File(inputFile).readLines()
        var x = mutableListOf<List<Int>>()
        for (line in lines) {
            x.add(line.trim().split(" ").map{it.toInt()})
        }
        val t = x[0][0]
        var j = 0
        for (i in 0 until t) {
            val money = x[1+j][0]
            val cost = x[3+j]
            j = j + 3
            println("ID numbers of costs: ${iceCream(cost, money)}")
        }
    }
    catch (exception: Exception) {
        println("Input file not found!")
    }
}
