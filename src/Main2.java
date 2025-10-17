import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Printer {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\sample.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println("Don't miss");
            writer.println("See you then");
            System.out.println("Data written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String line;
        System.out.println("Enter your inputs, type 'exit' to quit:");

        while (true) {
            line = c.nextLine();
            if (line.equalsIgnoreCase("exit"))
                break;
            System.out.println("You entered: " + line);
        }
        c.close();
    }
}