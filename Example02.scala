// lets you read user input:
import scala.io.StdIn.readLine

object Example2 {
    def run(): Unit = {

        // for loops look different in Scala than in Java
        
        // make a sequence of integers (using data type Seq[int])
        val nums = Seq(7, 12, 5, 13, 9, 40)

        // print them using a for loop 
        // (this would be a for each loop in java)
        for (n <- nums)
            println(n)

        
        // The same can be done with a List[String]
        var names = List(
            "Jose",
            "Peter",
            "Bill",
            "Joanna",
            "Randy",
            "Alaiyah",
            "Makki"
        )

        for(p <- names)
            println(p)


        // you could do the same thing with the foreach method, by
        // passing the println function into the foreach function
        println("########## Using foreach ##########")

        nums.foreach(println)
        names.foreach(println)

        // you could pass in a function you wrote instead, for a custom print
        println("########## Using custom function ##########")

        nums.foreach(addToEachAndPrint)
        names.foreach(addToEachAndPrint)

    }

    def addToEachAndPrint(input: String): Unit = {
        println(s"@${input}@, ")
    }

    def addToEachAndPrint(input: Int): Unit = {
        print(s"@${input}@, ")
    }
}
