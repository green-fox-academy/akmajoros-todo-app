import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDoList {

  public void printUsage() {
    Path usagePath = Paths.get("PrintUsage.txt");
    try {
      List<String> lines = Files.readAllLines(usagePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

    public void printToDo() {
    Path listPath = Paths.get("list.txt");
    try {
      List<String> lines = Files.readAllLines(listPath);
      if (lines.size() == 0) {
        System.out.println("No todos for today");
      }
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(i+1 + " - " + lines.get(i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
