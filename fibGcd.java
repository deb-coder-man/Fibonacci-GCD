//Importing scanner object to be able to read user input
import java.util.Scanner;

public class fibGcd {

    public static void main(String[] args) {
        
        // Opening up scanner object to read input from user
        Scanner inp1 = new Scanner(System.in);

        // Obtaining first nth value to find the fibonacci sum for
        System.out.print("Enter first nth number to find fibonacci sum for:");
        int fib1Index = inp1.nextInt() - 1; // Need to minus one because of zero-indexing

        // Obtaining second nth value to find the fibonacci sum for
        System.out.print("Enter second nth number to find fibonacci sum for: ");
        int fib2Index = inp1.nextInt() - 1; // Need to minus one because of zero-indexing

        // Calling a function to obtain the nth + 2 fibonacci number, then minus 1 to find the sum of all fibonacci numbers up to that index
        long fibSum1 = nthFib(fib1Index + 2) -1;
        long fibSum2 = nthFib(fib2Index + 2) -1;

        // First value parsed into gcd function must be the biggest one, meaning fibSum1 must be larger than fibSum2, if not then we need to fix this
        if (fibSum1 < fibSum2) {
            long temp = fibSum1;
            fibSum1 = fibSum2;
            fibSum2 = temp;
        }

        // Calling the gcd function, and printing out the greater common divisor
        System.out.println("\nGreatest common divider is: " +  gcd(fibSum1, fibSum2));

    }

    // Function used to find the nth Fibonacci number
   public static long nthFib(int index) {
         // Golden of Ratio
         double phi = (1 + Math.sqrt(5)) / 2;
         // Reciporcal of  Golden Ratio
         double psi = (1 - Math.sqrt(5)) / 2;
         // Formula to find the nth Fibonacci number, Binet's equation
         return (long)((Math.pow(phi, index) - Math.pow(psi, index)) / Math.sqrt(5));
   }

   //Function used to find the gcd between two numbers, using recursion
   public static long gcd(long num1, long num2) {
        if (num2 == 0) {
            // If num 2, which is the previous remainder equals 0, then the gcd is num1
            return num1;
        } else {
            // A is the the previous num2, B is the previous remainder, and remainder is the current remainder
            System.out.println("\nA: " + num1);
            System.out.println("B: " + num2);
            System.out.println("Remainder: " + num1 % num2);
            // Calling the function again with the num2 being the new num1, and the remainder of modulus between num1 and num2 being the new num2
            return gcd(num2, num1 % num2);
        }
   }
  
}
