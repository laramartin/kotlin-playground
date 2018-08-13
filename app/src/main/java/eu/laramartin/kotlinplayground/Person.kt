package eu.laramartin.kotlinplayground

/**
 * Decompile the Kotlin Bytecode to Java
 *
 * Look at the getters/setters created and named for each parameter
 *
 * @param val name: String => it creates a getter getName
 * @param var fingers: Int => it creates getter getFingers() and setter setFingers()
 * @param var isMarried: Boolean => it creates getter isMarried() and setter setMarried()
 */
class Person(val name: String, var fingers: Int, var isMarried: Boolean)
