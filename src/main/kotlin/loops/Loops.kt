package loops

fun main() {

    /**
     * There are two types of loops in Kotlin,
     *      * for
     *      * while
     */

    for (i in 1..100) { // 1..100 creates an int range, from 1 to 100
        println(i)
    }

    /**
     * for can iterate over any collection of data.
     *      for (item in collection) println(item)
     */

    var x = 10
    while (x > 0) {
        x--
        println(x)
    }

    /**
     * The code starts with x having the value 10, and since 10 is greater than 0, it executes the code inside the block.
     * It keeps decreasing the value of x, and printing the current value of x, until it gets to 0, and the condition becomes false
     *
     * There is a variation of while, known as "do-while". The first loop executes and then checks the condition to continue. This ensures
     * the code is executed at least once.
     */

    var y = 10
    do {
        y--
        println(y)
    } while (y > 0)

    /**
     * With while loops, you can easily create an infinite loop. If you do, your program will get stuck and die in a pitiful StackOverflowException
     */

    var z = 10
    while (z > 0) {
        z++
        println(z)
    }
    println("We will never get here ")

    /**
     * The value is incremented everytime, and never gets less than 0, so the while loop has no reason to stop. The println() will never be called.
     */
}