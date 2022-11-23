package QuizLet;


public class Quiz {

	public static void main(String[] args) {
		
		Question question1= new MultipleChoiceQuestion(
				"(1)What is the chemical symbol of HELIUM?",
				"Hu","Hl","He","H","HM","c");
		question1.check();
		
		Question question2= new MultipleChoiceQuestion(
				"(2)What is the chemical symbol of IRON?",
				"Fe","Ir","I","In","Sr","a");
		question2.check();
		
		Question question3= new MultipleChoiceQuestion(
				"(3)What is the chemical symbol of CHLORINE?",
				"ch","Ch","Cr","Cl","Ci","d");
		question3.check();
		
		Question question4= new MultipleChoiceQuestion(
				"(4)What is the chemical symbol of IODINE?",
				"Io","I","IO","Ii","i","b");
		question4.check();
		
		Question question5= new MultipleChoiceQuestion(
				"(5)What is the chemical symbol of NITROGEN?",
				"NIT","No","Nt","Ni","N","e");
		question5.check();
		
		Question question6 = new TrueFalseQuestion("(1) 1 foot is greater than 1 meter","FALSE");
		question6.check();
		
		Question question7 = new TrueFalseQuestion("(1) 1 foot is greater than 1 meter","FALSE");
		question7.check();
	
		Question question8 = new TrueFalseQuestion("(1) 1 foot is greater than 1 meter","FALSE");
		question8.check();
		
		Question question9 = new TrueFalseQuestion("(1) 1 foot is greater than 1 meter","FALSE");
		question9.check();
		
		Question question10 = new TrueFalseQuestion("(1) 1 foot is greater than 1 meter","FALSE");
		question10.check();
		
		Question.showResults();
	}

}
