import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\student.ser");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(student);
        }catch (IOException e) {
            //
        }


        student.setFirstName("John");
        student.setLastName("Doe");
    }
}
