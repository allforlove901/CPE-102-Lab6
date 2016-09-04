import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Formatter;

public class Reverser {

	private Formatter x; 
	private File file;
	Scanner in;
	PrintWriter out;
	
	public void openFile(File inputFile){	
		try{
			in = new Scanner(inputFile);
			in.useDelimiter("(?<=.)");
			//out = new PrintWriter(inputFile);
		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
	
	public void writeToFile(File outputFile) throws FileNotFoundException{
		String output = "";
		while(in.hasNext()){
			output = in.next() + output;
		}
		System.out.println(output);
		out = new PrintWriter(outputFile);
		out.print(output);
	}
	
	public void closeFile(){
		out.close();
		in.close();
	}
	
}
