package lab_14;

import java.io.IOException;

import static lab_14.Task9.longestZeroSequenceLength;

public class Main {
	public static void main(String[] args) {
		String path = "D:\\test\\";
		String sourceFileTask3 = "task3.txt";
		String destinationFileTask3 = "task3dest.txt";

		try {
			Task3.copyNoEmptyStrings(path + sourceFileTask3,path + destinationFileTask3);
			System.out.println("Success!!! Task 3 completed");
		} catch (IOException e) {
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