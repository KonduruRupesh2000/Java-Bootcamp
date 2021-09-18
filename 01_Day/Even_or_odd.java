package com.company;

import java.util.Scanner;

public class Even_or_odd {

        public static void main(String[] args) {
            int num;
            System.out.println("Enter the Numer");
            Scanner in=new Scanner(System.in);
            num=in.nextInt();
            if(num%2==0){
                System.out.println("Number is EVEN");
            }
            else{
                System.out.println("Number is ODD");
            }
        }
}
