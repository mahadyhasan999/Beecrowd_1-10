/*Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by
 the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example,
 with a blank space before and after the equal signal.*/

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()
    val D = scanner.nextInt()

    // Calculate the student's average with weights
    val difference = (A*B - C*D)

    println("DIFERENCA = $difference")
}
