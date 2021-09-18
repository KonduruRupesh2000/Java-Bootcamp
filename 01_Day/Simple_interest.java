package com.company;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal amount :");
        int p=in.nextInt();
        System.out.println("Enter the time(No of yrs) :");
        int t=in.nextInt();
        System.out.println("Enter the Intrest rate :");
        int r=in.nextInt();
        int SI= (p*t*r)/100;
        System.out.println("Simple Intrest : "+SI);
    }
}
