package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		int score = 0;
		speak("what is 1+1");

		String ans = JOptionPane.showInputDialog("what is your answer");

		if (ans.equals("2")) {
			speak("correct");
			score = score + 1;
		}

		else {
			speak("wrong");
		}
		speak("What is the full form of pi");

		String m = JOptionPane.showInputDialog("what is your answer");

		if (m.equals("3.14159265359")) {
			speak("correct");
			score = score + 1;
		}

		else {
			speak("wrong");
		}
		speak("What is the most popular board game of all time?");

		String q = JOptionPane.showInputDialog("what is your answer");

		if (q.equals("chess")) {
			speak("correct");
			score = score + 1;
		}

		else {
			speak("wrong");
		}
		speak("In the children's books about a 25 foot tall red dog, what is the name of the dog?");

		String g = JOptionPane.showInputDialog("what is your answer");

		if (g.equals("clifford")) {
			speak("correct");
			score = score + 1;
		}

		else {
			speak("wrong");
		}
		speak("What was the name of Taylor Swift's first album?");

		String n = JOptionPane.showInputDialog("what is your answer");

		if (n.equals("Taylor Swift")) {
			speak("correct");
			score = score + 1;
		}

		else {
			speak("wrong");
		}
	

speak("How many US Supreme Court justices are there?");

String c = JOptionPane.showInputDialog("what is your answer");

if(c.equals("9")){
speak("correct");
score = score + 1;
}

else{
speak("wrong");	
}


	speak("Which team won the 2016 Super Bowl?");

String b = JOptionPane.showInputDialog("What is your answer?");

if(b.equals("Denver Broncos")){
speak("correct");
score = score + 1;
}

else{
speak("wrong");	
}
speak("The reaction where two atoms of hydrogen combine to form an atom of helium is called what?");
String a = JOptionPane.showInputDialog("What is the answer");

if(a.equals("Fusion")){
speak("correct");
score = score + 1;
}

else{
speak("wrong");	

}
speak("you scored"+ score + "out of 8");

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}