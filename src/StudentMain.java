import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");

        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\student.ser");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(student);
        }catch (IOException e) {
            //
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Student s = (Student) in.readObject();
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }catch (IOException | ClassNotFoundException e) {
            //
        }


        student.setFirstName("John");
        student.setLastName("Doe");
    }
}
