import java.util.Scanner;

  public class EveOdd {

   public static void main(String[] args) { 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    if( n%2== 0)
    { System.out.println("IT is Even"); }
    else 
    { System.out.println("IT is ODD"); }
    

  }
 }
