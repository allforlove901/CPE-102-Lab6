
public class Coin {

	private double value;
	private String name;
	
	public Coin(double aValue, String name)
	{
		value = aValue;
		this.name = name;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public int compareTo(Coin anotherCoin)
	{
		if(anotherCoin.getValue() > this.getValue())
			return -1;
		if(anotherCoin.getValue() < this.getValue())
			return 1;
		return 0;
		
	}
}
