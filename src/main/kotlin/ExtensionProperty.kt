/**
 * --------------------
 * Extension Properties
 * --------------------
 *
 * Similar to Extension Function but with the receiver type added.
 * They are accessed like class members
 */

val String.lastChar: Char
    get() = get(length - 1)

fun useExtensionProperty() {
    println("Kotlin".lastChar)
}

fun main(args: Array<String>) {
    useExtensionProperty()
}

