package com.sparta.em.engineering50.javabasics;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.isWhitespace;

public class LongestPalindrome {

    public String getLongestPalindrome(String sentence) {

        ArrayList<String> words = new ArrayList();
        ArrayList<String> palindromes = new ArrayList();

        sentence = cleanSentence(sentence);
        words = findWords(sentence);
        palindromes = findPalindromes(words);
        return findLongestWord(palindromes);
    }

    //clean up sentence method to shape the sentence to be easier to handle:
    public String cleanSentence(String inputString){
        inputString += " ";//adding space to end of sentence to make word collecting stop here (even if it has no full stop)

        //replace punctuation and special characters  with space
        ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd','e','f', 'g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        for (int i = 0; i < inputString.length(); i++) {
            if (!alphabet.contains(inputString.charAt(i))) {
                //System.out.println(inputString.charAt(i) + " is not a letter");
                inputString = inputString.replace(inputString.charAt(i), ' ');
            }
        }
        return inputString;
    }

    //method to find words in sentence:
    public ArrayList<String> findWords(String inputSentence){
        ArrayList<String> wordList = new ArrayList(); // collect words here
        String word = "";
        for (int i = 0; i < inputSentence.length(); i++) {
            if (isWhitespace(inputSentence.charAt(i))) {
                //System.out.println(word);
                wordList.add(word);
                //System.out.println("Words in sentence:" + wordList);
                word = "";
            } else if (!isWhitespace(inputSentence.charAt(i)) ) {
                word = word + inputSentence.charAt(i);
            }
        }
        return wordList;
    }


    //method that creates a list of palindromes found
    public ArrayList<String> findPalindromes(ArrayList<String> wordList){
        ArrayList<String> palindromeList = new ArrayList(); //collect palindromes here
        for (String j : wordList){
            PalindromeChecker palindromeChecker = new PalindromeChecker();
            if ( palindromeChecker.isPalindrome(j) == true){
                palindromeList.add(j);
            }
        }
        return palindromeList;
    }


    //method to find the longest one
    public String findLongestWord(ArrayList<String> list){
        String longestPhrase = "";
        for (String phrase : list){
            if (longestPhrase.length() < phrase.length()){
                longestPhrase =  phrase;
            } else if (longestPhrase != "" && longestPhrase.length() == phrase.length()){
                longestPhrase += ", " + phrase;
            }
        }
        if (longestPhrase == "") {
            return "There are no palindromes in this text.";
        } else {
            return longestPhrase;
        }
    }

}
