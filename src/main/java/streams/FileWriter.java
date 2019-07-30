package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileWriter {
    public void writeFile(String filename, String data) throws FileNotFoundException {
        FileOutputStream writer = new FileOutputStream(filename);
        try (writer){
            writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("IO Exception:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
