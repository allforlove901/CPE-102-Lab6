
public class Quiz implements Measurable {

	private int score = 0;
	private String grade;
	
	public Quiz(int score, String grade)
	{
		this.score = score;
		this.grade = grade;
	}
	
	public double getMeasure()
	{
		return score;
	}
	
	public double getScore(){
		return score;
	}
	
	public String getGrade(){
		return grade;
	}
}
