package com.sparta.em.engineering50.javabasics;

public class Main {

    public static void main(String[] args) {

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String word = "radar";
        System.out.println(word + " is palindrome: " + palindromeChecker.isPalindrome(word));

        LettersOfAlphabet lettersOfAlphabet = new LettersOfAlphabet();
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Input contains all letters of the alphabet: " + lettersOfAlphabet.containsAllLetters(str));

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println("Longest palindrome(s) in the sentence: " +  longestPalindrome.getLongestPalindrome("? da, radar. madam "));



    }
}
