package QuizLet;

import javax.swing.JOptionPane;

public abstract class Question {
	
	static int nQuestions=0;
	static int nCorrect=0;
	
	String question;
	String correctAnswer;
	
	abstract String ask();
	void check() {
		String answer=ask();
		nQuestions++;
		if (answer.equals(correctAnswer)){
	     	JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "
		    +correctAnswer+".");
		}
	}
	
	static void showResults() {
		JOptionPane.showMessageDialog(null,"You correct "+nCorrect+" out of "+nQuestions+".");
	}

}
