import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception{
    public static void main(String[] args) {
        try {
           readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }

    // Method with a throws clause
    static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        // Code to read from the file
    }
}