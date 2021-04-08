package com.revature.introdemos.datastructures

/**
  * A List is a linked list under the hood. So it is probably like LinkedList in Java.
  * It is immutable, like strings, so you can only create new Lists using old Lists.
  * Since it is a linked list, accessing elements is O(N) and not O(1), so accessing
  * elements in a large List can take a long time.
  * 
  * Initialize:
  *     val ints = List(1, 2, 3)
  *     val names = List("Joel", "Chris", "Ed")
  * 
  *     or
  * 
  *     val ints: List[Int] = List(1, 2, 3, 4)
  * 
  * Adding elements:
  *     (a new list has to be created, so you technically can't really add to one, 
  *      but you can make a new one)
  * 
  *     val b = 0 +: ints
  *     val c = -1 +: b
  *     val d = -2 +: c
  * 
  * More info: https://docs.scala-lang.org/overviews/scala-book/list-class.html
  */
object ListTest {
    def run() : Unit = {

        val ints = List(1, 2, 3, 4, 5)  // a linked list

        val b = 0 +: ints
        val c = -1 +: b
        val d = -2 +: c

        println(ints)
        println(b)
        println(c)
        println(d)


        // another way to declare a list
        val list = -1 :: 0 :: 1 :: 2 :: 3 :: Nil

        println(list)  // comes out as a List type

        println(d(3))
        println(list(3))

    }
}
