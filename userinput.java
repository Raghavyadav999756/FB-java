import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        System.out.println("enter a second number");
        int number2=sc.nextInt();
        System.out.println(" THE SUM OF " + number + " AND " + number2 + " is " + (number+ number2));
        
    }

    
}
