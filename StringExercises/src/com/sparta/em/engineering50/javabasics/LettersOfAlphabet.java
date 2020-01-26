package com.sparta.em.engineering50.javabasics;

import java.util.ArrayList;

public class LettersOfAlphabet {

    public boolean containsAllLetters(String sentence){
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i","j","k", "l", "m", "n", "o", "p", "q","r","s", "t", "u", "v", "w", "x", "y","z"};
        for (String i : alphabet){
            if (!sentence.contains(i)) {
                return false;
            }
        } return true;
    }

}
