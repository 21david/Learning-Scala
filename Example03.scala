// lets you read user input:
import scala.io.StdIn.readLine

object Example03 {
    def run(): Unit = {

        // This data type is equivalent to HashMap in Java
        val ratings = Map(
            "Animal Crossing" -> 5.0,
            "Guitar Hero" -> 5.0,
            "Super Mario Bros" -> 4.8,
            "Mario Kart" -> 5.0,
            "Metroid Prime Hunters" -> 3.0,
            "Mario Party" -> 3.9,
            "Rock Band" -> 4.7,
            "RuneScape" -> 4.8,
            "Final Fantasy" -> 2.0,
            "The Legend of Zelda" -> 3.0
        )

        // it can be printed like this:
        // "for each name and rating pair in ratings, do this"
        for((name, rating) <- ratings)
            println(s"Game series: $name, My rating: $rating")


        // another way, using the foreach function:
        // i think we are creating an anonymous function and using it for each element
        ratings.foreach {
            case(game, rating) => println(s"Key: $game, Value $rating")
        }
    }
}
