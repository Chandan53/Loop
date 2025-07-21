package Loop;
import java.util.*;

public class loop11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==1){
            System.out.println("is not a prime number");
        }
        else{
            for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime == true){
            System.out.println(n + " n is a prime number ");
        }
        else {
            System.out.println(" is a composite number");
        }

        }
        
        
    }
    
}
