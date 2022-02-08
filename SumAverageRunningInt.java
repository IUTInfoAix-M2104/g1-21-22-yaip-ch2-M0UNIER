/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average = 0 ;       // average in double
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;

      // Use a for-loop to sum from lowerbound to upperbound
      
      int count = 0;
      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum = sum + number*number;
         ++number;		 // update number
		 ++count;        // update count
      } while (number <= UPPERBOUND);  // test
      // Compute average in double. Beware that int / int produces int!
	  average = (double) sum / (double)(count);
      
      // Print sum and average
      System.out.println(sum);
	  System.out.println(average);
   }
}
// question 3 : la boucle for sert lorsque l'on connais le nombre exact de tour de boucle a réalisé alors que le while-do réalisera des tour de bouvle tant que la condition n'est pas réalisé .