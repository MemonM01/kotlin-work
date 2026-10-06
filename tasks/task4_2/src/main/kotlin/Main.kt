// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("""Pizza Menu
    a) Margherita
    b) Triple Meat
    c) Vege Delight
    d) Chicken""".trimIndent())

    print("\nYour choice:  ")

    val choice = readln().lowercase()

    if (choice.length == 1 && choice[0]  in ('a' .. 'd')) {
        println("\nOrder accepted")
    }
    else {
        println("Invalid Choice!")
    }
}
