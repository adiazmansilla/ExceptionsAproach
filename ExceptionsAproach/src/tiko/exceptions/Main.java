package tiko.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		readMyFile();
	}

	public static void readMyFile() throws IOException {

		Path read = Paths.get("src/tiko/exceptions/ReadMyFile");
		Path write = Paths.get("src/tiko/exceptions/WriteMyFile");
		
		try (BufferedReader in = Files.newBufferedReader(read); // Utilizar Files
			BufferedWriter out = Files.newBufferedWriter(write);																				// interfaz
		) {

			System.out.println("***** writing *****");
			System.out.println(System.getProperty("user.dir")); //With this line you can see where is java looking at.
			out.write(in.readLine());
			System.out.println("***** END *****");
			
		}

	}

}
