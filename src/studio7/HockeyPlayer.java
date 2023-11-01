package studio7;

public class HockeyPlayer {
	public String name;
	public int num;
	public boolean rHand;
	public boolean directionRight;
	public int goals, assists;
	public int points;
	public int gamesPlayed;
	
	public HockeyPlayer(String name, int num, boolean rHand, int goals, int assists, int gamesPlayed, boolean directionRight) {
		this.name = name;
		this.num = num;
		this.rHand = rHand;
		this.assists = assists;
		this.goals = goals;
		this.gamesPlayed = gamesPlayed;
		this.directionRight = directionRight;
		
		points = assists + goals;
		
	}
	
	
}
