package com.revature.introdemos.datastructures

// import the ArrayBuffer data structure
import scala.collection.mutable.ArrayBuffer

/**
  * ArrayBuffer seems to be like ArrayList in Java.
  * initialize like this:
  * 
  *     var ints = ArrayBuffer[Int]()
  *     var numbers = ArrayBuffer(10, 20, 30)
  *     var strings = ArrayBuffer[String]()
  * 
  *  Access elements at index i with:
  *     
  *     ints(i)
  *     numbers(i)
  *     strings(i)
  * 
  *  And notable methods are:
  * 
  *   - using += to add to the end
  *   - using -= to remove an element
  *   - .insert(index, element)
  *   - .append(element1, element2, element3, ...)
  *   - .appendAll( Seq(elem1, elem2, elem3, ...) )
  *   - .prepend(element1, element2, element3, ...)
  *   - .prependAll( Seq(elem1, elem2, elem3, ...) )
  *   - .remove(index)
  *   - .remove(indexStart, howManyElementsToRemove)
  *   - .trimStart(howManyToTrim)
  *   - .trimEnd(howManyToTrim)
  *   - .clear  // to remove all the elements
  * 
  *  More info: https://docs.scala-lang.org/overviews/scala-book/arraybuffer-examples.html
  */
object ArrayBufferTest {
    def run() : Unit = {

        var ints = ArrayBuffer[Int]()
        var strings = ArrayBuffer[String]()

        // add elements
        ints += 13
        ints += 20
        ints += 1020
        ints += 69 += 420 += 30
        println(ints)


        // initialize with elements
        var numbers = ArrayBuffer(10, 20, 30)

        // add elements to the beginning
        numbers.insert(0, 0)
        numbers.insert(0, -10)
        numbers.insert(0, -20)
        numbers.prepend(-30) // this does the same exact thing
        numbers.prepend(-40)
        println(numbers)

        // some ways to remove elements
        numbers.remove(0, 4)  // starting at index 0, remove 4 elements
        numbers -= 30  // remove the element '30'
        numbers.remove(0)  // remove the element at index 0
        numbers.remove(0)  // remove the element at index 0
        println(numbers)


        // now i will just play with all the methods
        numbers.appendAll(Seq(30, 40, 60, 70, 90)) 
        numbers.prepend(0, 10, 15)
        numbers.insert(6, 50)
        numbers.insert(9, 80)
        numbers += 100 += 110

        println(numbers)

        numbers.trimStart(3)
        numbers.trimEnd(1)

        println(numbers)

        println(numbers(0))
        println(numbers(4))
        println(numbers(5))

        // any index out of bounds causes an exception
        println(numbers(9))

    }
}
