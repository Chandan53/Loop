package Loop;
import java.util.*;

public class loop10 {
    public static void main(String args[]){
        // display all the number entered by user except the multiples of 10
        Scanner sc=new Scanner(System.in);
        do{
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("display all the number by user except multiple of 10 "  + num);
        } while(true);

    }
    
}
