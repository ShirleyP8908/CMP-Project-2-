package promptBank;
import java.util.Random;

public class PromptBank {

	String [] questions;
	String [] statements;
	Random random = new Random();
	
	public PromptBank(){
		questions = new String [3];
		statements = new String [3];
		//questions = new String[   ]; //initialize your array to the correct length to match your number of questions you populate it with
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
		populateQuestionsArray();
		populateStatementsArray();
	}
	
	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
	    statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		/*complete this method with your other statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		/*complete this method with your other questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public String getRandomStatementTrunk(){
		int i = random.nextInt(3);
		String statement = statements[i];
		return statement;
		//fill in the method so it randomly selects the statement template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
	
	public String getRandomQuestionTrunk(){
		int i = random.nextInt(3);
		String question = questions[i];
		return question;
		//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
	public String firstPalabra(String Palabra) {
		return Palabra.split(" ")[0];
	}
	public String secondPalabra(String Palabra) {
		String Palabras[] = Palabra.split(" ");
		return Palabras[Palabras.length - 1];
	}
	public String replacingBlanks(String Palabra, String replacedStr, String mainPalabra) {
		return mainPalabra.replaceAll(Palabra, replacedStr);
	}	
}
