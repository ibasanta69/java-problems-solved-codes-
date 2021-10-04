package Com.ChaudharybAsanta;
import java.util.Scanner;
//wap to Convert Days Into Years,Moths and Days. The Program Is Coded By Basanta Chaudhary
public class Main {

    public static void main(String[] args) {

	// write your code here
        int days,Years,Months;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number Of Days:");
        days=s.nextInt();
        Years=days/365;
        Months=(days-Years*365)/30;
        days=days-(Years*365)-(Months*30);
        System.out.println("Years  "+Years);
        System.out.println("Moths  "+Months);
        System.out.println("Days  "+days);

    }
}
