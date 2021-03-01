package lab_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Task3 {
    static void copyNoEmptyStrings(String source, String destination) throws IOException {
        try(FileReader fr = new FileReader(source, Charset.forName("Windows-1252"));
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destination, Charset.forName("Windows-1252"));
            BufferedWriter bw = new BufferedWriter(fw)){
            String str;
            while ((str = br.readLine()) != null){
                if(!str.isEmpty()){
                    bw.write(str+"\n");
                }
            }
        }
    }
}
