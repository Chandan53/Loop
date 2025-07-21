package Loop;
import java.util.*;

public class loop9 {
    public static void main(String args[]){
        // keep entering number till user enter a multiple of 10
        Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        // using if else statement
        // if(num %10==0){
        //     System.out.println(num + " is a multiplication of 10");
        // }
        // else{
        //     System.out.println(" is not a multiplication of 10");
        // }

        // using loop 
        while(true){
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println("is a multiple of 10");
                break;
            }
            System.out.println(" is not a multiplication of 10 ");
        }

    }
    
}
