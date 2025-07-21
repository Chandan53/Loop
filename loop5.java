package Loop;

public class loop5 {
    public static void main(String args[]){
        // reverse the given number
        // to get last digit use --> %
        // to delete last digit use --> /
           int num=6012003;
           while(num>0){
                 int lastdigit=num%10;
                 System.out.print(lastdigit);
                num=num/10;


           }
                 System.out.println();

    }
    
}
