package com.company;
//Wap to DIsplay Fibonacci Series i java .The Program Is Coded By Basanta chaudhary !
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5,first=0,second=1;
        System.out.println("The First "+n+"  terms !");
        for (int i=1;i<=n;i++){
            int sum =first+second;
            first=second;
            second=sum;
            System.out.println(first+" ");
        }
    }
}
