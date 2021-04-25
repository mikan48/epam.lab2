package epam.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public String Read(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sBuilder = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sBuilder.append(line);
                sBuilder.append(System.lineSeparator());
                line = br.readLine();
            }
            String text = sBuilder.toString();

            return text;
        }
    }
}
