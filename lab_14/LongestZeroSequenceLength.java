package lab_14;

import java.io.FileReader;
import java.io.IOException;

public class LongestZeroSequenceLength {
    public static long longestZeroSequenceLength(String filename) throws IOException {
        try(FileReader input = new FileReader(filename)){
            char[] buf = new char[512];
            int readResult;
            int maxZeroStringSize = 0, currentZeroStringSize = 0;
            while ((readResult = input.read(buf)) != -1){
                for (int i = 0; i < readResult; i++){
                    System.out.println(buf[i]);
                    if(buf[i] == '0'){
                        currentZeroStringSize++;
                    } else {
                        if(currentZeroStringSize > maxZeroStringSize){
                            maxZeroStringSize = currentZeroStringSize;
                        }
                        currentZeroStringSize = 0;
                    }
                }
            }
            if(currentZeroStringSize > maxZeroStringSize){
                maxZeroStringSize = currentZeroStringSize;
            }
            return maxZeroStringSize;
        } catch (IOException e) {
            throw new IOException("file not found", e);
        }
    }
}
