// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main(args: Array<String>){
    if (args.size != 1) {
        println("\nError: Invalid number of inputs in command line. Must be 3")
        exitProcess(1)
    }

  val filePath = Path(args[0])
  val fileLines = filePath.readLines()

  var maxLength: Int = 0
  var lineNum: Int = 0
  var lineCounter = 1

    for (line in fileLines) {
      if (line.length > maxLength) {
        maxLength = line.length
        lineNum = lineCounter
      }
      lineCounter += 1
    }

    println("Line ${lineNum} is the longest (length = ${maxLength})")

  }

