
public enum Score {
	WIN, LOSE, EQUAL, ERROR;
	
	static String print(Score str) {
		if (str.equals(Score.WIN))
				return ("당신이 이겼습니다.");
		else if (str.equals(Score.LOSE))
			return ("컴퓨터가 이겼습니다.");
		else if (str.equals(Score.EQUAL))
			return ("비겼습니다.");
		else	// Score.Error
			return "오류";
	}
}
