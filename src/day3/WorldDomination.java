package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String ans = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.

		if (ans.equals("yes")) {
			System.out.print("You will rule the world.");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			System.out.print("good luck washing dishes");
		}
	}
}
