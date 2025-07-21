package Loop;
import java.util.*;

public class loop2 {
    public static void main(String args[]){
        // print 1 to n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
    
}
