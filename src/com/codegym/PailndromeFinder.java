package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PailndromeFinder {

    private String inputString;
    private Stack<Character> charStack = new Stack<Character>();

    public PailndromeFinder(String str) {
        inputString = str;
        fillStack();
    }

    private void fillStack() {
        for (int i = 0; i < inputString.length(); i++)
            charStack.push(inputString.charAt(i));
    }

    private String buildReserve() {
        String result = new String();
        while (!charStack.empty()) {
            result += charStack.pop();
        }
        return result.toString();
    }

    public boolean isPalindromeFinder() {
        return inputString.equalsIgnoreCase(buildReserve());
    }
}
