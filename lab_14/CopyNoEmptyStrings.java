package lab_14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyNoEmptyStrings {
    public static void copyNoEmptyStrings(String source, String destination) throws IOException {
        try (FileReader input = new FileReader(source); FileWriter output = new FileWriter(destination);) {
            char[] buffer = new char[512];
            int thread;
            boolean start = true;
            int count = 0;
            while ((thread = input.read(buffer)) != -1) {
                for (int i = 0; i < thread; i++) {
                    count++;
                    if (buffer[i] == 13 && start) {
                        continue;
                    }
                    if (buffer[i] == 10 && start) {
                        continue;
                    }
                    if (buffer[i] == 10) {
                        start = true;
                    } else {
                        start = false;
                        output.write(buffer[i]);
                    }
                    if (count == 0) {
                        throw new IllegalArgumentException("Empty file");
                    }
                }
            }
        } catch (IOException ex) {
            throw new IOException("not exist file", ex);
        }
    }
}
