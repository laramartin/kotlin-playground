/**
 * --------------------
 * INITIALIZING CLASSES
 * --------------------
 *
 * @constructor() is the primary constructor
 * @init{} is a initializer block, contains code that will be executed when initializing the class
 *
 * The class GamerConciseSyntax is equivalent to class Gamer. In the primary constructor of the GamerConciseSyntax class,
 * it is declaring the property `val username: String`.
 *
 * Decompile to Java to see they are the same.
 */

class Gamer constructor(username: String) {
    val username : String

    init {
        this.username = username
    }
}

class GamerConciseSyntax(val username: String)