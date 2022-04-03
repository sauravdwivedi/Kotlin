/** Write a method to read two matrices from StdIn and print
 *  their product matrix.
 */
 
import java.util.Arrays
 
class MatrixMultiplication(
    val name: String,
    var rows: Int = 0,
    var cols: Int = 0,
    var matrix: MutableList<Array<Int>> = mutableListOf<Array<Int>>()
    ) {
    
    fun setMatrix():  MutableList<Array<Int>> {
        println("Matrix $name rows:")
        this.rows = readLine()!!.trim().toInt()
        println("Matrix $name cols:")
        this.cols = readLine()!!.trim().toInt()
        println("Space separated Matrix $name entries (e.g. '1 2 3'): ")
        var matRaw = readLine()!!.trim().split(" ").map{it.toInt()}.toTypedArray()
        for (i in 0 until rows) {
            this.matrix.add(matRaw.slice((i*cols)..(i*cols + cols - 1)).toTypedArray())
        }
        return this.matrix
    }
}

fun multiplyMatrices(
    matA: MatrixMultiplication,
    matB: MatrixMultiplication
    ): MutableList<Array<Int>> {
    
    var prodMat: MutableList<Array<Int>> = mutableListOf<Array<Int>>()
    for (i in 0 until matA.rows) {
        var prodMatRow: MutableList<Int> = mutableListOf<Int>()
        for (j in 0 until matB.cols) {
            var prodMatIJ = 0
            for (k in 0 until matA.cols) {
                prodMatIJ += matA.matrix[i][k] * matB.matrix[k][j]
            }
            prodMatRow.add(prodMatIJ)
        }
        prodMat.add(prodMatRow.toTypedArray())
    }
    return prodMat
}

fun main() {
    val matA = MatrixMultiplication("A")
    matA.setMatrix()
    val matB = MatrixMultiplication("B")
    matB.setMatrix()
    if (matA.cols == matB.rows) {
        println("The product Matrix is: ")
        val prodMat = multiplyMatrices(matA, matB)
        var result = "\n"
        for (i in 0 until matA.rows) {
            result += "\t" + Arrays.toString(prodMat[i]) + "\n"
        }
        println(result)
    } else {
        println("Matrices can't be multiplied!")
    }
}
