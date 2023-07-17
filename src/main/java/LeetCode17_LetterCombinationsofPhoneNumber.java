package src.main.java;

import java.util.*;

//Given a string containing digits from 0-9 inclusive,
//        return all possible letter combinations that the number could represent.
//        A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//
//        Example:
//
//        Input: "23"
//        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
public class LeetCode17_LetterCombinationsofPhoneNumber {
    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println(letterCombinations("233").toString());
    }




    private static void addLetter(String digits, String word, List<String> ans) {
        String[] btn = {"0","1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.isEmpty()) {
            if (!word.isEmpty())
                ans.add(word);
        } else {
            for (int i = 0; i < btn[digits.charAt(0) -'0'].length(); i++) {
                addLetter(digits.substring(1), word + btn[digits.charAt(0) - '0'].charAt(i), ans);
            }
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        addLetter(digits, "", ans);
        return ans;
    }
}
