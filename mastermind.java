package pracs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mastermind {

	public static void main(String[] args) {
		int attemps = 10;
		mastermind testo = new mastermind();
		List<String> set_colours = new ArrayList<String>();
		for(int i = 0; i < 4; i++ ) {	
			set_colours.add(testo.colours());	
			System.out.println(set_colours);
		}
		while(attemps >= 0) {	
			if(attemps == 0) {
				System.out.println("better luck next time.");
				break;
			}
			List<String> user = new ArrayList<String>();
			System.out.println("Please enter your four colours:");
			Scanner scan1 = new Scanner(System.in);
			String try1 = scan1.nextLine();
			user.add(try1);
			Scanner scan2 = new Scanner(System.in);
			String try2 = scan1.nextLine();
			user.add(try2);
			Scanner scan3 = new Scanner(System.in);
			String try3 = scan1.nextLine();
			user.add(try3);
			Scanner scan4 = new Scanner(System.in);
			String try4 = scan1.nextLine();
			user.add(try4);
			//System.out.println(user);
			//System.out.println(set_colours.get(0));
			int counter = 0;
			for(int i=0;i<4;i++) {
				if(user.get(i).equals(set_colours.get(i))) {
					counter++;
					System.out.println("Black peg");			
				}
				else {
					for(int k = 0; k < user.size(); k++) {
						if(user.get(i).equals(set_colours.get(k))) {
							System.out.println("White peg");
						}
					}
				}
			
			}
			if(counter == 4) {
				System.out.println("winner winner chicken dinner");
				break;
			}
			attemps --;
		}
	}
		
		

	public String colours() {
		List<String>choices1 = new ArrayList<String>();
		choices1.add("green");
		choices1.add("yellow");
		choices1.add("red");
		choices1.add("blue");
		choices1.add("blank");
		//System.out.println(choices1);
		Random ran = new Random();
		String random_colour = choices1.get(ran.nextInt(choices1.size()));
		//System.out.println(random_colour);
		return random_colour;
	}

}
