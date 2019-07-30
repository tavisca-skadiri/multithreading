package streams;

import java.io.*;

public class ConsoleReader {
    public static void main(String[] args) {
        writeToConsole("Hello");
        writeFloat((float) 4.5);
    }
    static void writeFloat(float data){
        DataOutputStream dataOutputStream = new DataOutputStream(System.out);
        try {
            dataOutputStream.writeFloat(data);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static  void writeToConsole(String data){
        OutputStream writer = new BufferedOutputStream(System.out);
        try {
            writer.write(data.getBytes());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
