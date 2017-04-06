import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDo {
  public void checkToDo(String[] args){
    Path filePath = Paths.get("list.txt");
    List<String> content;
    String itemToCheck;
    try {
      content = Files.readAllLines(filePath);
      itemToCheck = content.get(Integer.parseInt(args[1]) - 1);
      String copyTo = itemToCheck.replaceFirst(" ", "x");
      content.set((Integer.parseInt(args[1]) - 1), copyTo);
      Files.write(filePath, content);
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
