package Project.Fight_Game;

import java.util.Scanner;

public class Calculation {

	
	
	static Scanner in = new Scanner (System.in);
	static boolean IsAlive=true;
	static String answer;
	
	
	public static void ResultCalculation(Data A,Data B) {
	
		IsAlive=true;
		
       while (IsAlive) {
    	

    	   		// Random Attack + result calculation // 
    	System.out.println(A.getName()+" "+"Attack");
		int Player1AttackPower=RandomFight.getRandomAttackPower();
		int NewPower1=A.getPower()-Player1AttackPower;
        A.setPower(NewPower1);
        int NewDefance2=B.getDefance()-Player1AttackPower/5;
        int newHealth2=B.getHealth()-(Player1AttackPower/10); 
        B.setDefance(NewDefance2);
        B.setHealth(newHealth2);
        
        System.out.println(B.getName()+" "+"Attack");
        int Player2AttackPower=RandomFight.getRandomAttackPower();
        
        int NewPower2=B.getPower()-Player2AttackPower;
        B.setPower(NewPower2);
        int NewDefance1=A.getDefance()-(Player2AttackPower/5);
        int newHealth1=A.getHealth()-(Player2AttackPower/10); 
        A.setDefance(NewDefance1);
        A.setHealth(newHealth1);
        
                               // result //
   	 System.out.println(A.getName() + " " +"Power Is :" +"  " +A.getPower());
     System.out.println(A.getName() + " " +"Health Is :" + "  " +A.getHealth());
     System.out.println(A.getName() + " " +"Defance Is :" + "  " +A.getDefance());
     System.out.println(B.getName() + " " +"Power Is :" + " " +B.getPower());
     System.out.println(B.getName() + " " +"Health Is :" + " " +B.getHealth());
     System.out.println(B.getName() + " " +"Defance Is :" + " " +B.getDefance());
     System.out.println("Number Of Rounds " + " " + A.getRound());
    

    if (A.getHealth() <= 0 || A.getDefance() <= 0 || A.getPower() <= 0 ) {
    	System.out.println("You Lost" +" " + A.getName()+ " " +"After :" + " " +(A.getRound()-1)+" " + "Rounds"); 
    	
	      A.setDefance(+3000);
	      A.setHealth(+3000);
	      A.setPower(+3000);
	      A.setRound(A.getRound());
	      B.setHealth(+3000);
	 	  B.setPower(+3000);
	 	  B.setDefance(+3000);
	 	  B.setRound(B.getRound());
    	IsAlive=false;
    	}
	     
	     
    
    if (B.getHealth() <= 0 || B.getDefance() <= 0 || B.getPower() <= 0 ) {
    	System.out.println("You Win"+" "+A.getName() + " " +"& " + " " +B.getName()+"  Lost " +"After :" + " " +(A.getRound()-1)+" " + "Rounds");
    	System.out.println("You Get 2000 Points Will Add To Your Health & Power & Defance"+"\nYour Enemy will Get 1000 Will Add To His Health & Power & Defance ");
    	
    	            // Wining Earn //
    	
    	A.setHealth(A.getHealth() + 2000);
    	A.setPower(A.getPower() + 2000);
    	A.setDefance(A.getDefance() + 2000);
        B.setHealth(B.getHealth() + 1000);
 	    B.setPower(B.getPower() + 1000);
 	    B.setDefance(B.getDefance()+1000);
 	    A.setRound(A.getRound());
 	    B.setRound(B.getRound());
 	   IsAlive=false;
 
 	                       // upgrade // 
 	   
 	  if (A.getHealth() >= 10000 || A.getDefance() >= 10000 || A.getPower() >= 10000 ) {
 	     	System.out.println("Your Player Upgraded To Level 2");
 	     	Player1AttackPower=Player1AttackPower*2 ;
 	     	}

 	     
 		 if (A.getHealth() >= 20000 || A.getDefance() >= 20000 || A.getPower() >= 20000 ) {
 	      	System.out.println("Your Player Upgraded To Level 3");
 	      	}
    }
       }
	}
}
    

	
	

