import java.util.Scanner;

public class Swap2Integers{
	public static void main (String[] args){
		int number1 , number2 , swap;  // déclaration de variable
		
		// l'utilisateur effectue les entré clavier
		Scanner in = new Scanner(System.in);             
		System.out.print("Enter first the integers: ");
        number1 = in.nextInt();
		System.out.print("Enter second the integers: ");
        number2 = in.nextInt();
		in.close();
		
		// le Swap des deux variable 
		
	    swap = number1;
		number1 = number2;
		number2 = swap;
		
		
		
		// affichage du résultat
		
		System.out.println(" After the swap , first integer is :" + number1 +"  and the second interger is : " + number2);
		
	}
}
		
		
