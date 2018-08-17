/**
 * -----------------
 * Custom accessors
 * -----------------
 *
 * Decompile the Kotlin Bytecode to Java
 */
class Rectangle(private val height: Int, private val width: Int) {

    val isSquare: Boolean
        get() = height == width
}