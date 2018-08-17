/**
 * -------------------
 * Extension Functions
 * -------------------
 *
 * It is possible to create a function that extends an existing class.
 * 1. When declaring the function, write the name of the class to be extended
 * 2. Append "." and the name of the function
 * 3. Define the rest of the function
 * 4. The body of the function has access to public methods in the extended class
 */
fun String.lastChar() : Char = this.get(this.lastIndex)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}