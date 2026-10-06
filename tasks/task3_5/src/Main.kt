// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")
    filePath.writeText("Im writing to this file")
    filePath.appendText(" Wrote to this file again") // appendText doesnt get rid of content allready their, if u were to use writeText again it would get rid of previous file contents.
    val fileContents = filePath.readText()
    println(fileContents)
}
