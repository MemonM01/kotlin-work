// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
  if (args.size != 3) {
    println("\nError: Invalid number of inputs in command line. Must be 3")
    exitProcess(1)
  }

  var total: Float = 0.0f
  for (x in args) {
    total += x.toFloat()
  }
  val score = (total/3).roundToInt()


  val grade = when (score) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
  }

  println("Your score was " + score + " " + "which results in a " + grade)

}