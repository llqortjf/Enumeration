
public enum Game {
	ROCK(0), PAPER(1), SCISSORS(2), ERROR(-1);
	
	private int gameNum;
	Game(int num){
		gameNum = num;
	}
	
	static Game encode(String input) {
		if(input.equals("가위")) 
			return Game.SCISSORS;
		else if(input.equals("바위")) 
			return Game.ROCK;
		else if(input.equals("보")) 
			return Game.PAPER;
		return Game.ERROR;
	}
}
