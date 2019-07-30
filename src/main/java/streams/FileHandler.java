package streams;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContents();

        readFileContents();
    }

    private static void readFileContents() {
        FileReader fileReader = new FileReader();
        try {
            System.out.println(fileReader.readFile("DataFile.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid filename");
            e.printStackTrace();
        }
    }

    private static void writeFileContents() {
        FileWriter fileWriter = new FileWriter();
        try {
            String hello = "Hello. Hi. How are you? Have a great Day";
            fileWriter.writeFile("DataFile.txt", hello);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid filename");
            e.printStackTrace();
        }
    }
}
