// lets you read user input:
import scala.io.StdIn.readLine

// run "Example01.run" to run this code

object Example01 {
    def run(): Unit = {
        var inputA = readLine()
        var inputB = readLine()

        println("\n" + s"${inputA} and ${inputB}...")

        // if statments return a value, so you could stuff like this
        // they're technically called 'if expressions'
        var variable = 
        if (inputA.equals(inputB)) 
            "The names are the same!"
        else if(inputA.length() == inputB.length())
            "They are different, but they have the same length"
        else if(Math.abs(inputA.length() - inputB.length()) <= 2)
            "They are different, but they almost have the same length."
        else
            "The names are different." 

        println(variable) 
    }
}
