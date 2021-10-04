package Com.ChaudharybAsanta;
import java.util.Scanner;
//wap to find smallest number among them 'n' Numbers is given By user. The Program Is Coded By Basanta chaudhary !
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int[] num=new int[100];
        int smallest=1,i,n;
        System.out.println("How Many Numbers are There ........?");
        n=s.nextInt();
        System.out.println("There are "+n+"  Numbers !");
        for (i=1;i<=n;i++){
            System.out.println("["+i+"]=");
            num[i]=s.nextInt();
            if (num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("THe Smallest Number is :"+smallest);
    }
}
