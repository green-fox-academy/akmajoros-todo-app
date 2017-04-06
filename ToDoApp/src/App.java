import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

      if (args.length == 0) {
        Path filePath = Paths.get("PrintUsage.txt");
        try {
          List<String> lines = Files.readAllLines(filePath);
          System.out.println(lines);
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Uh-oh, could not read the file!");
        }
      }
    }
}
