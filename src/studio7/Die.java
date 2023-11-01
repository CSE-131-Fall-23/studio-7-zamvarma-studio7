package studio7;

public class Die {

	public int sides;
	
	public int thrown () {
		int rVal = (int)(Math.random()*(sides+1));
		
		if (rVal==0) {
			rVal++;
		}
		
		return rVal;
	}
	
	public Die(int n) {
		this.sides = n;
	}
}
