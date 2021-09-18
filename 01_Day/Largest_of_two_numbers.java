package com.company;

import java.util.Scanner;

public class Largest_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}
