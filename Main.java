
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //prompting the user to enter a number and taking input
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        MyInteger i1 = new MyInteger(a);

        System.out.println(a + " is even? " + i1.isEven());
        System.out.println(a + " is odd? " +i1.isOdd());
        System.out.println(a + " is prime? " +i1.isPrime());
        System.out.println("19 is prime? " + MyInteger.isPrime(19));
        char[] c = {'2','3','1','4'};

        System.out.println("characters convert to number " + MyInteger.parseInt(c));
        String s = "1231231";

        System.out.println("String convert to int: " + MyInteger.parseInt(s));
        System.out.println("21 is odd? " + MyInteger.isOdd(21));
        System.out.println(a + " is equal to 25? " + i1.equals(25));

    }//end of main block
}//end of main class
