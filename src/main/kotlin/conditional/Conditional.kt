@file:Suppress("LiftReturnOrAssignment", "MoveVariableDeclarationIntoWhen")

package conditional

fun main() {

    /**
     * Kotlin programs execute linearly, one line at a time. Sometimes, making decisions or repeating a step can come in handy.
     *
     * For decision-making, Kotlin has two constructs
     *      * if-else
     *      * when
     */

    val a = 5
    val b = 12
    val max: Int

    if (a > b) { // Makes decision based on the condition inside the brackets ()
        max = a // if a > b is true, this block is executed
    } else {
        max = b // else this is executed
    }

    println(max) // Prints 12

    /**
     * The else part in an if-else is optional. You might want to do something when the condition is true, but not when it's false
     * Instead of leaving the else block empty, you can omit it
     */

    val size = 3
    when(size) {
        1 -> println(1)
        2 -> println(2)
        3 -> { println(3) }
        else -> println("We didn't find what you're looking for")
    }

    /**
     * The when statement makes decision based on the "size". The else clause handles everything that isn't specified.
     *
     * The else can be optional if the compiler determines that you have already handled all possible values
     */
}