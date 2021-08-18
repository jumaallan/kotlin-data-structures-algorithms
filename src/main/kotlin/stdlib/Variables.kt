@file:Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "JoinDeclarationAndAssignment", "CanBeVal")

package stdlib

fun main() {

    /**
     * A variable is a way to store information. A variable has a name, and the data type
     *
     * Kotlin has two types of variables
     *
     *      ::: var - value can be updated (Mutable)
     *      ::: val - value cannot be updated (Immutable)
     *
     *      The compiler can determine the data type of variable. This is called "type inference"
     *
     *      If you need to declare a variable, but initialize it later, you need to explicitly define the data type
     */

    // The compiler will use type inference to determine the data type
    val name = "Juma Allan" // value cannot be changed
    var country = "Kenya" // value can be updated

    println("name $name")
    println("country $country")

    // name = "Allan Juma" - would not compile, throws an error
    country = "Tanzania" // value is updated from "Kenya" to "Tanzania"

    println("updated country $country")

    // Explicitly defining the data type of variable - allows us to assign a value of type Int later
    var age: Int
    age = 26 // assign value (can only accept a type Int)

    println("age $age")

    /***
     * Kotlin has several data types, but the basic types are:
     *
     *      Numbers
     *          Are either
     *              Integer Types
     *                  * Long (to specify a Long explicitly, append the suffix "L") - 1L
     *                  * Int - 1
     *                  * Short
     *                  * Byte
     *              Floating-point Types
     *                  * Double (16-16 decimal digits, 64 bits) - 2.7182818284
     *                  * Float (6-7 decimal digits, 32 bits)- 2.7182818284f, actual value is 2.7182817. Floats are tagged by "F" or "f"
     *
     *      Characters
     *          * Char - 'J'
     *          * String - "Juma Allan"
     *      Other
     *          * Boolean - true
     *               - Has build in operations
     *                     * || - disjuction (logical OR) - work lazily
     *                     * && - conjuction (logical AND) - work lazily
     *                     * ! - negation (logical NOT)
     *          * Array
     *
     *
     *   You can use underscores to make number constants more readable
     *      val oneMillion = 1_000_000
     *      val bytes = 0b11010010_01101001_10010100_10010010
     *      val creditCardNumber = 1234_5678_9012_3456L
     *
     *   All number types support conversions to other types
     *      toByte() : Byte
     *      toShort() : Short
     *      toInt() : Int
     *      toLong() : Long
     *      toFloat() : Float
     *      toDouble() : Double
     *      toChar() : Char
     *
     *
     *
     */

}