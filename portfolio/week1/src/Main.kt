// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

// Muhammad Shafay memon
// Student ID: 201957435

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){
  //checking whether the arguments are less then 3, if they are you output the error
  if (args.size < 3) {
    println("Error: values for a, b, c required on command line")
    exitProcess(1)
  }

  // declaring a,b,c and changing their type from string to double. Double instead of float as double is more accurate. 
  val a = args[0].toDouble()
  val b = args[1].toDouble()
  val c = args[2].toDouble()

  //using the heron formula to work out the area
  val s = (a + b + c) / 2.0
  val area = sqrt(s * (s - a) * (s - b) * (s - c))

  //printing the area, %.5f formats the output to 5 decimal places. as the portfolio task wants 6.00000 exactly. if you dont do %.5f this would output 6.0 which wouldnt be correct. 
  println("Area = %.5f".format(area))
}
