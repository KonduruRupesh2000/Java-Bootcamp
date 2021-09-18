package com.company;

import java.util.Scanner;

public class Convert_inr_to_usd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter currency(in inr) : ");
        float a=in.nextFloat();
        System.out.println("USD : "+(a/73));

    }
}
