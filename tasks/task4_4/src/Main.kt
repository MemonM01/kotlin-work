// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    val t = Terminal()

    if (args.size != 3) {
        println("\nError: Invalid number of inputs in command line. Must be 3")
        exitProcess(1)
    }

    val initialTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val incrementTemp = args[2].toFloat()

    var x = initialTemp
    var y = 0.0f


    t.println(table {
    header { row("Celsius", "Fahrenheit") }
        while (x in initialTemp..maxTemp) {
        y = ((9 * x) / 5) + 32
        body { row(x, y) }
        //println("%5.1f Celsius    %6.1f Fahrenheit")
        x += incrementTemp
    }
    })


}
