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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Defance;
		result = prime * result + Health;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + Power;
		result = prime * result + round;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (Defance != other.Defance)
			return false;
		if (Health != other.Health)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Power != other.Power)
			return false;
		if (round != other.round)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Data [Power=" + Power + ", Defance=" + Defance + ", Name=" + Name + ", Health=" + Health + ", round="
				+ round + "]";
	}
	
}	
