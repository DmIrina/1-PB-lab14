package lab_14;

import java.io.IOException;

import static lab_14.CopyNoEmptyStrings.copyNoEmptyStrings;
import static lab_14.LongestZeroSequenceLength.longestZeroSequenceLength;

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
		try {
			System.out.println("Length of longest zero sequence: "
					+ longestZeroSequenceLength("C:\\Users\\User\\eclipse-workspace\\hg.txt"));
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}


}