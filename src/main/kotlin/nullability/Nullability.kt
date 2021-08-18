@file:Suppress("CanBeVal")

package nullability

// We create a variable to hold a car
data class Car(
    val name: String,
    var doors: Int = 4
)

fun main() {

    /**
     * Kotlin has a concept of null. You can assign a null to a variable whenever you want to signal that an object has no value
     */

    var car: Car? = null // the "?" changes the variable type to optional, allowing us to set null as the value

    println("null car ${car?.name}") // prints null

    val benz = Car( // We can then re-assign the value later on
        name = "Mercedes Benz"
    )

    println("car name ${benz.name}")
    println("car doors ${benz.doors}") // picks the default value that was assigned when creating the data class, unless changed - 4

    /**
     * The "?" operator tells the compiler that the object could contain a null value
     *
     * With the operator, we cannot use:
     *      car.drive()
     *
     *  Instead, we use the safe-call operator "?."
     *      car?.drive()
     *
     *  Using the safe-call operator means the function will only execute when the object is not null
     *
     *  To assign values to variables that hold null values, we use "?:", known as the Elvis Operator
     *      val car: Car = car ?: Car("BMW")
     *          This code does a few things
     *              * Creates an immutable variable, car, that cannot be reassigned
     *              * The value now contains a real car
     *              * The value can be a "car" or "BMW" if the car is null (not a real car)
     *
     *  In some scenarios, you might not want to play by the rules. For example, you know a variable is not a null - even thought it's optional,
     *  and you need to tell the compiler to use the value that it holds.
     *  Kotlin provides the not-null assertion operator ("!!"). If the variable contains a null value, it'll throw an NPE.
     *      car!!.drive()
     */

}