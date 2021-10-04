package Com.ChaudharybAsanta;
import java.util.Scanner;
//wap to count negative ,positive and zero given numbers by Users.The Program Is Coded By Basanta chaudhary
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,n;
        Scanner s=new Scanner(System.in);
        int count_neg=0,count_pos=0,count_zero=0;
        System.out.println("How Many Numbers there are ....?");
        n=s.nextInt();
        int []num=new int[100];
        System.out.println("Theren are "+n+"  Number !");
        for (i=0;i<n;i++){
            System.out.println("["+i+"]=");
            num[i]=s.nextInt();
            if(num[i]>0){
                count_pos++;

            }else if(num[i]<0){
                count_neg++;

            }else {
                count_zero++;

            }
        }
        System.out.println("The Positive Number Is: " +count_pos);
        System.out.println("The Negative Number Is: "+count_neg);
        System.out.println("THe zero Number Is: "+count_zero);
    }
}
