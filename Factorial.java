import java.util.Scanner;

public class Factorial
{
	public static Scanner keys = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter a positive int to find its factorial: ");
		String num = keys.nextLine();
		
		int number = Integer.parseInt(num);
		System.out.println(factorial(number));
	}
	/**
	* Recursive function that gets the factorial of the user's number
	* @return Returns the factorial of the user's int
	* @param The number the user has picked
	*/
	public static int factorial(int num)
	{
		if (num == 0)
		{
			return 1;
		}
		return num * factorial(num - 1);	
	}
}