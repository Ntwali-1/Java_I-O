import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\sample.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true));
             Scanner c = new Scanner(System.in)) {

            System.out.println("Enter your inputs (type 'exit' to quit):");

            while (true) {
                String line = c.nextLine();

                if (line.equalsIgnoreCase("exit"))
                    break;

                writer.println(line); // write to file
                System.out.println("You entered: " + line);
            }

            System.out.println("✅ Data saved to file successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
