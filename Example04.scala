// lets you read user input:
import scala.io.StdIn.readLine

object Example04 {
    def run(): Unit = {
        val numbers = Seq(4, 12, 7, 17, 8, 0, -4, 3, 21)


        // the 'yield' keyword is like a shortcut to create
        // a list using another list
        // it says "I want to yield a new collection from the 
        //   existing collection that I’m iterating over in the 
        //   for-expression, using the algorithm shown.”"
        val doubledNumbers = for (n <- numbers) yield n * 2

        doubledNumbers.foreach {
            case(num) => {
                print(num)
                print(" ")
            }
        }

        println("\n")

        // CAPITALIZING NAMES EXAMPLE
        // using a List[String] data type
        var names = List(
            "johnson",
            "peter",
            "rick",
            "isabella",
            "morty"
        )

        var properNames = for(name <- names) yield name.capitalize
        properNames.foreach(println)

        println()

        // Give them all a last name, as if they were a family:
        var newNames = for(n <- names) yield n.capitalize + " Sanchez"
        newNames.foreach(println)

        println()

        // You can put code in {} and write many lines
        var weirdNames = List(
            "_carl",
            "_mimo",
            "_hank",
            "_walter"
        )

        var fixedNames = for(n <- weirdNames) yield {
            var removeUnderscore = n.drop(1)
            var capitalized = removeUnderscore.capitalize
            capitalized  // this is what is returned basically
        }

        fixedNames.foreach(println)
    }
}
