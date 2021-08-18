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

}