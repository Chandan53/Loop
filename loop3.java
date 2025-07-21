package Loop;
import java.util.*;

public class loop3 {
    public static void main(String args[]){
        // print the sum of n number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=1;
        while(count<=n){
             sum +=count;
            System.out.println("sum of n number is " + sum);
            count ++;
        }
        System.out.println("total sum of all the number is " + sum);

    }
    
}
