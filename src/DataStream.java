import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\sample.txt");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeUTF("Hello World");
            dos.writeDouble(123.456);
            dos.writeInt(123456);
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            String text = dis.readUTF();
            double number = dis.readDouble();
            int value = dis.readInt();

            System.out.println("\n📖 Data read from file:");
            System.out.println("String: " + text);
            System.out.println("Double: " + number);
            System.out.println("Integer: " + value);
        } catch (IOException e) {
            //
        }
    }
}
