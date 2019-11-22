/* Author: Daniel Hammer
 * Updated: 2019/11/21
 *
 * A program to display all of the prime numbers
 *
 * Asks the user for an input, displays all prime numbers up to that input
 */

import java.util.Scanner;

public class PrimeNumberCounter{

    // Global input variable for user input
    private static int input;




    /* Logical method
     * Determines if the number is prime or not
     * and returns the appropriate boolean value
     */
    public static boolean isPrime(int num){

        // Starts at 2, the first prime number
        for (int x = 2; x < num; x++){

            /* If the remainder is 0, 
             * then 'x' is a factor of 'num' 
             * and the number is not prime
             */
            if ((num % x) == 0){
                return false;
            }
        }
        /* If the remainder is never 0
         * then the number has no factors other than 1 and itself
         * and is thus prime
         */
        return true;
    }




    public static void main(String[] args){

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an upper bound integer\n> ");
        input = sc.nextInt();


        System.out.println("\nDisplaying all prime numbers up to " + input);
        for (int x = 0; x < input; x++){
            
            // Checks if 'x' is prime and is not 0 or 1, which are not prime
            if (isPrime(x) && x != 0 && x != 1){
                System.out.print(x + ", ");
            }
        }
    }
}
