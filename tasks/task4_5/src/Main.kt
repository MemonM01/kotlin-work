// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("\nError: Invalid number of inputs in command line. Must be 3")
        exitProcess(1)
    }

    val upperLimit = args[0].toInt()

    var total = 0
    for ( n in 1..upperLimit step 2) {
        total += n
    }

    println(total)



}
