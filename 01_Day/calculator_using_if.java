package com.company;

import java.util.Scanner;

public class calculator_using_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("Enter the operator : ");
        char op=in.next().charAt(0);
        if(op=='+'){
            System.out.println("Addition : "+(a+b));
        }
        else if(op=='-'){
            System.out.println("Subtraction : "+(a-b));
        }
        else if(op=='*'){
            System.out.println("Multiplication : "+(a*b));
        }
        else if(op=='/'){
            System.out.println("Divison : "+(a/b));
        }
    }

}
