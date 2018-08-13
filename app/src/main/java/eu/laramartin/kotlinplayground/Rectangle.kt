package eu.laramartin.kotlinplayground

/**
 * -----------------
 * Custom accessors
 * -----------------
 *
 * Decompile the Kotlin Bytecode to Java
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}
