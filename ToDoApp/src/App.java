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
          for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
          }
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Uh-oh, could not read the file!");
        }
      }

      if (args.length > 0 && Arrays.toString(args).contains("-l")) {
        Path filePath = Paths.get("list.txt");
        try {
          List<String> lines = Files.readAllLines(filePath);
          if (lines.size() == 0) {
            System.out.println("No todos for today");
          }
          for (int i = 0; i < lines.size(); i++) {
            System.out.println(i+1 + " - " + lines.get(i));
          }
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Uh-oh, could not read the file!");
        }
      }
    }
}
