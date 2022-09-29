// Application:     Program 2
// Name:            Colin Marinpetro
// GitHub User:     cmarinpetro
// Date:            Sep 22, 2022
// Version:         1.0
// Description:     Scanners



// This command will import the scanner
import java.util.Scanner; 



public class MarinpetroProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// This will collect what the user says
		Scanner userScanner = new Scanner(System.in);
				
		// Asks what is your favorite number
				System.out.println("What is your first favorite number you want to pick?");
				int n1 = userScanner.nextInt();
				
		// Asks what is your second favorite number
				System.out.println("What is your second favorite number you want to pick?");
				int n2 = userScanner.nextInt();
				
		// Asks what is your third favorite number
				System.out.println("What is your third favorite number you want to pick?");
				int n3 = userScanner.nextInt();
				
		// Menu
				System.out.println("What option would you like to preform?");
				System.out.println("Here is what you can do");
				System.out.println(" 1. Multiply");
				System.out.println(" 2. Divide");
				System.out.println(" 3. Subtract");
				System.out.println(" 4. Add");
	
		// Option of your choice
				System.out.println("Which one would you like to do?");
	}
	
	// Switch
		switch ("Choices")
	
	int calculated0utput = 0;
		
		
		// Switch
		switch ("Choices")
		{
		
			calculated0utput = n1 * n2;
			calculated0utput = n1 / n2;
			calculated0utput = n1 - n2;
			calculated0utput = n1 + n2;
		
		}
			
		System.out.println("Your numbers " + operation + "equal" + calculated0utput);
		
		// if else
		
	if(calculated0utput>n3)
	{
		System.out.println(calulated0utput + "bigger" + n3);
	}
	else
	{
		System.out.println(calculated0utput + "Less" + n3);
	}
				
	


