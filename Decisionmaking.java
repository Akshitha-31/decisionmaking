import.java.util.Scanner;
package decisionmaking;
public class Decisionmaking {
  public static void main(String[] args) {
    int input;
    System.out.println("Enter your age : ");
    Scanner s = new Scanner(System.in);
    input = s.nextInt();
    if(input > 18)
      System.out.println("You are eligible to vote.");
    else
      System.out.println("You are not eligible to vote.");
  }
}

      
                        
                         
  
