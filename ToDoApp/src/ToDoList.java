import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  public void printUsage() {
    Path filePath = Paths.get("PrintUsage.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

    public void printToDo() {
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
    }
  }

  public void addToDo(String[] args) {
    Path filePath = Paths.get("list.txt");
    List<String> content;
    try {
      content = Files.readAllLines(filePath);
      content.add(content.size(), args[1]);
      Files.write(filePath, content);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
