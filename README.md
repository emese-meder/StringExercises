# StringExercises
Java string manipulation exercises

## PalindromeChecker 

contains the isPalindrome() method which returns true if the input word is a plaindrome (reads the same backwards)

## LettersOfAlphabet

the LettersOfAlphabet class contains the containsAllLetters() method that chech if the text entered as the parameter contains all the letters of the alphabet. 

## LongestPalindrome

Finds the longest palindrome in a sentence/text.

Steps of the method: 

**1.** cleanSentence() :cleans the text of any special characters and add a space to the end of the sentence so the findWords knows when to stop.

**2.** findWords() : a a character is a letter, then adds it to current word, if it is whitespace then adds current word to wordList and starts a new word. 

**3.** findPalindromes() : uses PalindromeChecker.isPalindrome() to find the palindromes in the wordList and add them to the palidromeList.

**4.** findLongestWord() : finds the longest palindrome(s) from the palindromeList and returns it (them). If there are no palindromes, then returns the String: "There are no palindromes in this text."
