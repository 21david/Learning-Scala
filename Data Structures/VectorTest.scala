package com.revature.introdemos.datastructures

/**
  * Vectors are immutable. They are the same as Lists, except they are not 
  * LinkedLists, so they have O(1) access to elements.
  * 
  * Initilize: 
  *     val nums = Vector(1, 2, 3)
  *     val names = Vector("Bob", "Joe", "Bill")
  * 
  * Access elements:
  *     nums(0)
  *     nums(1)
  *     nums(2)
  *     names(2)
  * 
  * Add elements (by creating a new Vector):
  *     val names2 = "Alex" +: names   // add to the beginning (prepend)
  *     val names3 = names2 :+ "Jack"   // add to the end (append)
  * 
  *     val names4 = Vector("Rick", "Morty", "Summer") ++: names3   // prepend another Vector
  *     val names5 = names4 :++ Vector("Rick", "Carl", "Negan")
  * 
  * More info: https://docs.scala-lang.org/overviews/scala-book/vector-class.html
  */
object VectorTest {
    def run() : Unit = {
        val vector = Vector()

        val nums = vector :++ Vector(1, 2, 3, 4, 5)

        // add elements by creating a new vector each time
        val a = nums :+ 6
        val b = a :+ 7
        val c = 0 +: b
        val d = -1 +: c
        val e = Vector(-4, -3, -2) ++: d
        val f = e ++ Vector(8, 9, 10)
        val g = f ++: Vector(11, 12)

        println(nums)
        println(a)
        println(b)
        println(c)
        println(d)
        println(e)
        println(f)
        println(g)

        // access elements in O(1) time
        println(f(1))
        println(f(2))
        println(f(12))


        // Strings
        val names = Vector("Bob", "Joe", "Bill")
        val names2 = "Max" +: names

        println(names2)
        println(names2(3))

    }
}
