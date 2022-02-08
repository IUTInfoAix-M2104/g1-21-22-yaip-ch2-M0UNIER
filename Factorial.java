/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class Factorial {   // Save as "Factorial.java"
   public static void main (String[] args) {
      // Define variables
      int product = 1;          // The accumulated sum, init to 0
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;

      // Use a for-loop to sum from lowerbound to upperbound
      
      int count = 0;
      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         product *= number;
         ++number;		 // update number
		 ++count;        // update count
      } while (number <= UPPERBOUND);  // test
    
      // Print sum and average
      System.out.println(product);

   }
}
// question 3 : la boucle for sert lorsque l'on connais le nombre exact de tour de boucle a réalisé alors que le while-do réalisera des tour de bouvle tant que la condition n'est pas réalisé .