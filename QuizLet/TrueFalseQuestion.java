package QuizLet;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		while(true) {
			
			String answer=JOptionPane.showInputDialog(question);
			answer=answer.toUpperCase();
			
			if(answer.equals("F")||answer.equals("FALSE")||answer.equals("N")||
				answer.equals("NO")) {
				return "FALSE";
			}
			else if(answer.equals("T")||answer.equals("TRUE")||answer.equals("Y")||
					answer.equals("YES")) {
				return "TRUE";
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");			
			}				
		}
	}

	TrueFalseQuestion(String question,String answer){
		this.question="TRUE or FALSE: "+question;
		this.correctAnswer=answer;
	}

}
