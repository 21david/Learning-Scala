// lets you read user input:
import scala.io.StdIn.readLine

object Example05 {
    def run(): Unit = {
        

        // basic for loops:
        for(i <- 1 to 10)
            print(i + " ")

        println()

        for(i <- 1 until 10)
            print(i + " ")

        println()


        // MATCH keyword, which is like switch in java

        println("Enter a rating between 1 and 5: ")
        var rating = readLine()

        rating match {
            case "1" => println("Awful")
            case "2" => println("Not great")
            case "3" => println("Alright")
            case "4" => println("Pretty good")
            case "5" => println("Amazing")
            case _ => println("(?)")
        }

        var ratingInWords = rating match {
            case "1" => "Awful"
            case "2" => "Not great"
            case "3" => "Alright"
            case "4" => "Pretty good"
            case "5" => "Amazing"
            case _ => "(?)"
        }

        println(s"So you said a rating of $rating, so your opinion is it is ${ratingInWords.toLowerCase()}")


        // testing the match based function
        var result1 = convertBooleanToString(true)
        var result2 = convertBooleanToString(false)

        println(s"result1 was ${result1}, and result2 was ${result2}")
    }

    // a match expression can be used as the body of a method
    def convertBooleanToString(boolVar: Boolean): String = boolVar match {
        case true => "you said true"
        case false => "you said false"
    }
}
