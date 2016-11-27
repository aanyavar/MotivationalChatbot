import java.util.Scanner;
/**
 * Write a description of class ChatbotRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChatbotRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Chatbot joe = new Chatbot();
		
		System.out.println (joe.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (joe.getResponse(statement));
			statement = in.nextLine();
		}
	}

}