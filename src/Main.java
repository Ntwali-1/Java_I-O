import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\sample.txt");

            System.out.println("Reading contents of the file:\n");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            System.out.println("\n\nFile reading completed!");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}