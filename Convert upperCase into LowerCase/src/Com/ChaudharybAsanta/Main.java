package Com.ChaudharybAsanta;
import java.util.Scanner;
//Wap to Convert LowerCase into UpperCase and Vice-versa. The Program Is Coded By Basanta Chaudhary
public class Main {

    public static void main(String[] args) {
	// write your code here
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character :");
        c=s.next().charAt(0);
        if(c>=65&&c<=90) {
            c+=32;
            System.out.println("The Character  " + c + "  Is LowerCase !");

        }else if(c>=97&&c<=122){
            c-=32;
            System.out.println("The Characeter "+c+"  Is UpperCase !");

        }
    }
}
