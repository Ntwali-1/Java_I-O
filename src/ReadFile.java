import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public void readFile() {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\DeployedProjects.txt");
            int content;
            while((content = fis.read()) != -1){
                System.out.print((char)content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
