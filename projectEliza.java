package promptBank;
import java.util.Scanner; 
public class projectEliza {
	
	public static void main (String[]args) {
        PromptBank prompt = new PromptBank();
		prompt.populateStatementsArray();
		prompt.populateQuestionsArray();
		Scanner readInput = new Scanner(System.in);
		String nombre;
		String Answer = "";
		String response = "Exit";
		String Phrase1 = "";
		String FirstResponse = "";
		String Answer2 = "";
		
		System.out.println("Eliza:   Hello, my name is Eliza. What is your name?");
		System.out.print("User:  ");
		nombre = readInput.nextLine();
		System.out.println("Eliza:   Hello " + nombre + " tell me what is on your mind today in 1 sentence.");
        Answer = readInput.nextLine();
        
		while(Answer.equalsIgnoreCase("Exit")) {
			System.out.println("Eliza:  Do you want to run the session again?");
			Answer = readInput.nextLine();
			 if(Answer.equalsIgnoreCase("yes")) {
				System.out.println("Eliza:   Hello, my name is Eliza. What is your name?");
				System.out.println("User:  ");
				nombre = readInput.nextLine();
				System.out.println("Eliza:   Hello " + nombre + " tell me what is on your mind today in 1 sentence.");
			    Answer = readInput.nextLine();
			}
			 else if(Answer.equalsIgnoreCase("no")) {
				System.out.println("Eliza: Goodbye, until next time");
				System.exit(0);
	         }	 
	    }
		  if(Answer.charAt(Answer.length()-1)=='?') {
				String Sentences = prompt.getRandomQuestionTrunk();
				String output = WordsRetrieval(FirstResponse.replace('?',' '), Sentences);
				System.out.println(output);
			}
		 else if(Answer.charAt(Answer.length()-1)=='!') {
		 String Sentences = prompt.getRandomStatementTrunk();
		 String output = WordsRetrieval(FirstResponse.replace('!',' '), Sentences);
		 System.out.println("WOW! Dramatic! " + output);
	}
	    else {
		 String statement = prompt.getRandomStatementTrunk();
		 System.out.println(WordsRetrieval(FirstResponse.replace('.', ' '), statement));
   }
}
	public static String WordsRetrieval(String Response, String Sentences) {
		String[] word = Response.split(" ");
		String word1 = word[0];
		String word2 = word[word.length - 1];
		String output = Sentences.replace("BLANK1", word1);
		return output.replace("BLANK2", word2);
	}
 }
