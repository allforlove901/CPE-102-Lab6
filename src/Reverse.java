import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) throws FileNotFoundException{
		File infile = null;
		if (args.length > 0)
			infile = new File(args[1]);
		else
			System.out.println("ermm");
		Reverser r = new Reverser();
		r.openFile(infile);
		r.writeToFile(infile);
		r.closeFile();
	}
	
}
