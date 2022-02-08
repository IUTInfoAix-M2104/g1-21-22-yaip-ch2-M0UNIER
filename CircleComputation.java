 
 
 
 
 
 
 import java.util.Scanner;   // For keyboard input
 
 public class CircleComputation {  // Save as "CircleComputation.java"
   public static void main (String[] args) {
 
 // Declare variables
      double radius, diameter, circumference, area,surfaceArea,volume,volume2,surfaceArea2,baseArea,height;  // inputs and results - all in double
     

      // Prompt and read inputs as "double"
	  Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double
      System.out.print("Enter the height: ");
      height = in.nextDouble();


      // Compute in "double"
      diameter = 2.0 * radius;
      area = Math.PI * radius * radius;
      circumference = 2.0 * Math.PI * radius;
      surfaceArea = 4 * Math.PI * radius * radius;
      volume = 4 /3 * Math.PI * radius * radius * radius;
      baseArea = Math.PI * radius * radius;
      surfaceArea2 = 2.0 * Math.PI * radius + 2.0 * baseArea;
      volume2 = baseArea * height;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.printf("Area is: %.2f%n", area);
      System.out.printf("Circumference is: %.2f%n", circumference);
      System.out.printf("SurfaceArea is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
      System.out.printf("Volume2 is: %.2f%n", volume2);
      System.out.printf("SurfaceArea2 is: %.2f%n", surfaceArea2);
      System.out.printf("BaseArea is: %.2f%n", baseArea);
   }
 }