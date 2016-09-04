
public class RealDataSequence implements Sequence {

	private int[] housePrices = {135, 235, 186, 220, 650, 742, 799, 244, 533, 200};
	private int index = -1;
	
	public int next()
	{

		index++;
		return housePrices[index];
		
	}
	
	public boolean hasNext()
	{
		if (index == 9)
			return false;
		return true;
	}
}
