
import java.util.Scanner;

public class project1 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the students name:");
    String name = sc.nextLine();
    System.out.println("enter the students ID:");
    int id = sc.nextInt();
    System.out.println("enter the students phone number:"); 
    long phone = sc.nextLong();
    System.out.println("enter the students email:");
    String email = sc.next();
    System.out.println("enter the students marks:"); 
    System.out.println("enter marks of subjects 1:");
    int marks1 = sc.nextInt();
    System.out.println("enter marks of subjects 2:");       
    int marks2 = sc.nextInt();
    System.out.println("enter marks of subjects 3:");   
    int marks3 = sc.nextInt();
    System.out.println("enter marks of subjects 4");
    int marks4=sc.nextInt();
    System.out.println("enter marks of subjects 5");

    int marks5=sc.nextInt();
    int total = marks1 + marks2 + marks3 + marks4 + marks5;
    double avg = total /5; 
    System.out.println("total marks : " +total); 
    System.out.println("your average : "  +avg);
    int temp = 0;
    if (avg >= 90) {        
        System.out.println("Grade: A");
    } else if (avg >= 80) {
        System.out.println("Grade: B");
    } else if (avg >= 70) {
        System.out.println("Grade: C");
    } else if (avg >= 60) {
        System.out.println("Grade: D");
    } else if (avg >= 50) {
        System.out.println("Grade: E");
    } else {
        System.out.println("Grade: F");
    }


    
   
    


    

  }
}
    
    







                            


      
  

    

