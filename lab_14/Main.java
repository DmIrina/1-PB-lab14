package lab_14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			copyNoEmptyStrings("C:\\Users\\User\\eclipse-workspace\\hg.txt",
					"C:\\Users\\User\\eclipse-workspace\\h.txt");
			System.out.println("Success!!!");
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void copyNoEmptyStrings(String source, String destination) throws IOException {
		try (FileReader input = new FileReader(source); FileWriter output = new FileWriter(destination);) {
			char[] buffer = new char[512];
			int thread;
			boolean start = true;
			int count = 0;
			while ((thread = input.read(buffer)) != -1) {
				for (int i = 0; i < thread; i++) {
					count++;
					char character = (char) buffer[i];
					if (character == 13 && start) {
						continue;
					}
					if (character == 10) {
						if (!start) {
							output.write(character);
						}
						start = true;
						continue;
					}
					start = false;
					output.write(character);
				}
				if (count == 0) {
					throw new IllegalArgumentException("Empty file");
				}
			}
		} catch (IOException ex) {
			throw new IOException("not exist file", ex);
		}
	}
}