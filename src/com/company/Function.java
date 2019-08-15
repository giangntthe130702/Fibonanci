package com.company;

import java.util.Scanner;

public class Function {

    public int checkInput(){
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            try{
                n = Integer.parseInt(sc.next());
                break;
            }
            catch (NumberFormatException ex){
                System.out.println("Input must be number !!!");
            }
        }
        return n;
    }

    public int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
