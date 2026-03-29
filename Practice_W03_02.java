//응용화학전공, 20220700, 이연주

import java.util.Scanner;

public class Practice_W03_02 {

	static Score[][] scoreBroad = {
			{Score.EQUAL, Score.LOSE, Score.WIN},
			{Score.WIN, Score.EQUAL, Score.LOSE},
			{Score.LOSE, Score.WIN, Score.EQUAL}
	};
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("컴퓨터의 입력: ");
		String comInput = s.next();
		Game computer = Game.encode(comInput);
		
		System.out.print("당신의 입력: ");
		String yourInput = s.next();
		Game user = Game.encode(yourInput);
		
		Score rslt = whowin(computer, user);
		System.out.println(Score.print(rslt));
	}
	
	static Score whowin(Game com, Game you) {
		if(you.equals(Game.ERROR)||com.equals(Game.ERROR))
			return Score.ERROR;		
		
		return scoreBroad[you.ordinal()][com.ordinal()];
	}
}
