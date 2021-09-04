package generics

fun main() {

    /**
     * Generics are a great way to abstract your code whenever you can manipulate multiple data types in the same way.
     *
     * Consider a class that emulates a Box. With a box, you can:
     *      * Put something into it
     *      * Grab something from it
     *      * Check if it's empty
     *
     */



    /**
     * Your box can handle any data type you want, and you’ll be sure that whatever you put in it,
     * has the same data type when you remove it from the box.
     *
     * You can also apply generics at a function level, and there can be restrictions applied to the kind of data types
     * the generic will accept. In Kotlin, there’s a way to say “I want all functions to return this generic data type”
     * or “I want only the input parameters to be this generic type”.

     * There’s a lot to learn about Generics, and you’ll need to research it as you progress with your data structures
     * and algorithms. But for now, you’ll start with two of the most common generic data structures that are already
     * provided by the Kotlin Standard Library.
     */

    val box = Sanduku<Int>()
    box.put(4)

    val boolBox = Sanduku<Boolean>()
    boolBox.put(true)
    boolBox.isEmpty()

}

/**
 * Once you put something into the box, you lose the knowledge of the object’s type since you had to use the
 * Any type to story any kind of object.
 */
class Box {

    var content: Any? = null

    fun put(content: Any?) {
        this.content = content
    }

    fun retrieve(): Any? {
        return content
    }

    fun isEmpty(): Boolean {
        return content == null
    }
}


/**
 * To get a more specialized box, you could replace Any with the data type you need; for example, a Cat or a Radio.
 * But you’d need to create a different type of Box for every type of object you’d want to store,
 * i.e. you’d have to create CatBox and RadioBox separately.
 *
 * Generics are an excellent way to keep the code abstract and let the objects specialize once instantiated.
 * To abstract Box, you can write it like this:
 */

class Sanduku<T> { // Means Box in Swahili, since we can't have two classes with the same name here :)
    var content: T? = null
    fun put(content: T?) {
        this.content = content
    }

    fun retrieve(): T? {
        return content
    }

    fun isEmpty(): Boolean {
        return content == null
    }
}

