package Loop;

public class loop8 {
    public static void main(String args[]){
        // break statement
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("-----------X");

        for(int j=1;j<=5;j++){
            if(j==3){
                continue;
            }
            System.out.println(j);
        }
    }
    
}
