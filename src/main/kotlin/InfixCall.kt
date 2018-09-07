/**
 * ------------
 * Infix Calls
 * ------------
 *
 * Infix call "to" on a pair does the same as invoking the function to().
 *
 * 1. Decompile the Kotlin bytecode to Java. The result is the same.
 *
 */

fun main(args: Array<String>) {
    val infixCall = 1 to "one"
    val regularFunctionCall = 1.to("one")

    println("Infix call: $infixCall")

    println("Regular function call: $regularFunctionCall")
}
