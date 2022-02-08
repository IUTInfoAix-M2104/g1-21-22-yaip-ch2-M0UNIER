
import java.util.Scanner;   // For keyboard input
public class SumProductMinMax3{
	public static void main (String[] args){

 // Declare variables
      int number1, number2, number3, number4,number5;  // The 3 input integers
      int sum, product, min, max;     // To compute these
	  
      // Prompt and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt(); 
      System.out.print("Enter second integer: ");  // No newline for prompting message
      number2 = in.nextInt(); 
	  System.out.print("Enter third integer: ");  // No newline for prompting message
      number3 = in.nextInt();
      System.out.print("Enter fourth integer: ");  // No newline for prompting message
      number4 = in.nextInt();
	  System.out.print("Enter fifth integer: ");  // No newline for prompting message
      number5 = in.nextInt();
      in.close();
	  
      // Compute sum and product
      sum = number1 + number2 + number3 + number4 + number5;
      product = number1 * number2 * number3 * number4 * number5;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
	  if (number4 < min){
		  min = number4;
	  }
	  if (number5 < min){
		  min = number5;
	  }
      
      // Compute max - similar to min
      max = number1;
	  if (number2 > max){
		  max = number2;
	  }
	  if (number3 > max){
		  max = number3;
	  }
	  if (number4 > max){
		  max = number4;
	  }
	  if (number5 > max){
		  max = number5;
	  }
	  
      
      // Print results
      System.out.println("the sum is : " + sum);
	  System.out.println("the product is : " + product);
	  System.out.println("the min is : " + min);
	  System.out.println("the max is : " + max);
	}
}