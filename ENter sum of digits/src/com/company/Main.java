package com.company;
import java.util.Scanner;
//wap to find sum of enter digits .The Program Is Coded By Baanta Chaudhary .
public class Main {

    public static void main(String[] args) {
	// write your code here
        int num,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        num=s.nextInt();
        for (sum=0;num!=0;num/=10){
            sum++;
        }
        System.out.println("The Sum Of Digits is :"+sum);
    }
}
