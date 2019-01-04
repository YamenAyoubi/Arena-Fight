package Project.Fight_Game;

import java.util.Scanner;



public class PlayMore {
	
	static Scanner in = new Scanner (System.in);
	
	static boolean PlayAgain(String answer) {
		
		String upperCaseString = answer.toUpperCase();
 		switch(upperCaseString) {
 		case "Y":
 			System.out.println("welcome Back 👍");
 			return true;
 		default:
 			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
 			return false;
}
}
	
	public static String GetPlayAgainAnswer() {
			return in.nextLine();
}
}