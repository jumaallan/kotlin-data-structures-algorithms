package functions

fun main() {

    /**
     * Functions are the smallest units of code that can be abstracted and re-used
     *
     * Are defined using the "fun" keyword, followed by the name of the function
     *
     * Can have a list of parameters, which include their data types. Can have no parameter.
     *
     * A func can have a return type, which is defined by a data type. A func cannot have more than one return type, but can miss a return type.
     */

    fun max(a: Int, b: Int): Int { // compares 2 numbers and returns the higher one
        return if (a > b) a else b
    }

    fun printMax(c: Int, d: Int) { // has no return type
        println(max(c, d))
    }
}