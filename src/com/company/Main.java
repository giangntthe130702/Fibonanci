package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Function f = new Function();
        int n;
        System.out.println("Enter n: ");
        n = f.checkInput();
        System.out.println("Sum: " + f.fib(n));
    }
}
