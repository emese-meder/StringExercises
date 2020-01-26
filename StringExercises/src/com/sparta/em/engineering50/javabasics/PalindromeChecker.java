package com.sparta.em.engineering50.javabasics;

import java.util.Objects;

public class PalindromeChecker {

    public boolean isPalindrome(String string){
        String word = string;
        StringBuilder thisString = new StringBuilder(string);
        StringBuilder reversedString = thisString.reverse();
        if ( word.equalsIgnoreCase(reversedString.toString()) ){
            return true;
        }else {
            return false;
        }

    }

}
