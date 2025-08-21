
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=7;i>=0;i--){
            System.out.print(n>>i & 1);
            System.out.print(" ");

        }
        System.out.println();
      
     
        
      
    }


    
}
