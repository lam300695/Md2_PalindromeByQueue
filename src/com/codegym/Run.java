package com.codegym;

public class Run {
    public static void main(String[] args) {
        PailndromeFinder pailndromeFinder = new PailndromeFinder("ala");
        System.out.println(pailndromeFinder.isPalindromeFinder());
        pailndromeFinder = new PailndromeFinder("lamlamalm");
        System.out.println(pailndromeFinder.isPalindromeFinder());
    }
}
