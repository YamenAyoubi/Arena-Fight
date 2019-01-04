package Project.Fight_Game;

import java.util.Scanner;


public class App 
{
	
	
	static Scanner in = new Scanner (System.in);
	
    public static void main( String[] args )
    {
        
    	boolean running = true; 
    	
    	
        String answer;

    	Data Player1 = new Data (3000, 3000, " Iron Man", 3000,0);
    	Data Player2 = new Data (4000, 4000, "Spider Man (Normal)", 4000,0);
    	Data Player3 = new Data (5000, 5000, "Wolf Man (Strong)", 5000,0);
    	Data Player4 = new Data (6000, 6000, "Hulk (Strongest)", 6000,0);
    	Data Player5 = new Data (7000, 7000, "Thor (Supernatural)", 7000,0);
    	Data Player6 = new Data (9000, 9000, "The King (Legend)", 9000,0);

        System.out.println("***Welcome To Our Fight Game*** "+ "\nPlease Create Your Own Character Pls Add The Name");
    	
    	Player1.setName(in.nextLine().toUpperCase());
    	
    	System.out.println("Are You Ready: " + Player1.getName() + " " +"\nAs Start Your Power & Heath & Defance Will be 3000 " + 
    	"\nYou Will Get 2000 Points If You Win" + 
    	"\n^^^^^^^^^^Be Ready Players Uploading^^^^^^^^^^^"		
    			
    			);
    	
    	while(running) { 
    		
    		do {

        System.out.println("Please Select the Player you wanna fight & type the fighter number ");
        
    	System.out.println("1:" + "" +Player2.getName());
    	System.out.println("2:" + "" +Player3.getName());
    	System.out.println("3:" + "" +Player4.getName());
    	System.out.println("4:" + "" +Player5.getName());
    	System.out.println("5:" + "" +Player6.getName());
    	
    	int Selection  = in.nextInt();

    		switch (Selection) {

    		case 1:
    		
    		System.out.println("Are You Ready To Fight " + Player2.getName());
    	    Calculation.ResultCalculation(Player1,Player2);
    	    running = false;
    	    
    		break;
    	    

    		case 2:

    		System.out.println("Are You Ready To Fight " + Player3.getName());
    		Calculation.ResultCalculation(Player1,Player3);
    		running = false;
    		break;
    		
    		case 3:
    		
    		System.out.println("Are You Ready To Fight " + Player4.getName());
    		Calculation.ResultCalculation(Player1,Player4);
    		running = false;
    		break;
    		
    		case 4:
    		
    		System.out.println("Are You Ready To Fight " + Player5.getName());
    		Calculation.ResultCalculation(Player1,Player5);
    		running = false;
    	    break;

    		case 5:
        		
        		System.out.println("Are You Ready To Fight " + Player6.getName());
        		Calculation.ResultCalculation(Player1,Player6);
        		running = false;
        	    break;
 
    		default:
                System.out.println("&&&& Wrong Entry Try Again Pls Select 1 Or 2 Or 3 Or 4 &&&& ");
            	running = true;}
    		

    		}while (running==true);
    
  	   	  System.out.println("Do You Want To Give Up Or Play Again ? (Y/N)");
  	   	      answer=PlayMore.GetPlayAgainAnswer().toUpperCase();
  		      running = PlayMore.PlayAgain(answer); 
  		      Player1.setRound(1);
  		      
  		      
  		      
    	}
    	
    }
    	} 

    	
 
     
