//  https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import scala.collection.mutable.ArrayBuffer

object Solution {
    def letterCombinations(digits: String): List[String] = {
        // 460 ms, faster than 34.25%
        // 53.4 mb, less than 6.85%
        
        val sol: Solution = new Solution()
        sol.letterCombinations(digits)
    }
}

class Solution {
    def letterCombinations(digits: String): List[String] = {
        if(digits.length() == 0)
            return List()
        
        val map: Map[Int, String] = Map(
            2 -> "abc",
            3 -> "def",
            4 -> "ghi",
            5 -> "jkl",
            6 -> "mno",
            7 -> "pqrs",
            8 -> "tuv",
            9 -> "wxyz"
        )
        
        val letters: ArrayBuffer[String] = ArrayBuffer()
        
        // create an array where the elements are the strings corresponding to each digit in the input 'digits'
        
        // for each number in 'digits'
        for(c <- digits) 
            // add the corresponsing letters to the array above
            letters += map(c-48)
        
        recursive("", letters)
        
        // convert solution from ArrayBuffer[String] to List[String]
        solution.toList
    }
    
    // this will store the solutions as we find them. Then, we return this at the end with the full solution. 
    // (we will need to convert types)
    var solution: ArrayBuffer[String] = ArrayBuffer()
    
    def recursive(a: String, b: ArrayBuffer[String]) : Unit = {
        // once the list is empty, then we have a valid letter combination in 'a'
        if(b.isEmpty) {
            solution += a
            return
        }
        
        // we take the first string in b and call recursive functions for each letter in b
        var first: String = b(0)
        
        // so for each letter, we add it to a the string that will represent a letter combination
        for(c <- first) {
            b.remove(0)
            recursive(a + c, b)
            b.prepend(first)
        }
    }
    
}
