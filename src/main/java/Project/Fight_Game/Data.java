package Project.Fight_Game;

public class Data {

	


	private int Power =0; 
	private int Defance =0; 
	private String Name;
	private int Health=0;
	private int round=1;
	

	public Data (int Power ,int Defance , String Name ,  int Health,int round) {
		
		this.Power=Power ; 
		this.Defance=Defance ; 
		this.Name=Name ; 
		this.Health=Health ; 
		this.round = round;

	}

	public int getPower() {
		return Power;
	}



	public void setPower(int power) {
		Power = power;
	}



	public int getDefance() {
		return Defance;
	}



	public void setDefance(int defance) {
		Defance = defance;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getHealth() {
		return Health;
	}



	public void setHealth(int health) {
		Health = health;
	}

	public int getRound() {
		round++;
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	

}	
