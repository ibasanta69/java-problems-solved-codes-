package com.company;
import java.util.Scanner;
//wap to Count number of Digits .The Program Is Coded By basanta chaudhary !
public class Main {

    public static void main(String[] args) {
	// write your code here
        int num,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        num=s.nextInt();
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("The Total Digits is :"+count);
    }
}
