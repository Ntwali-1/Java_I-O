import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            //Writing a File
            String content = "Hello World";
            fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Documents\\sample.txt");

            fos.write(content.getBytes());
            System.out.println("✅ File written successfully!\n");

            //Reading a File
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
                if (fos != null) {
                    fos.close();
                }
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}