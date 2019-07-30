package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class FileReader {
    String readFile(String filename) throws FileNotFoundException {
        String result = null;
        FileInputStream fileInputStream = new FileInputStream(filename);
        byte[] buffer;
        try(fileInputStream) {
            buffer = fileInputStream.readAllBytes();
            result = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
