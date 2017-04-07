import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

      ToDoList toDoList = new ToDoList();
      ToDo toDo = new ToDo();

      if (args.length == 0) {
        toDoList.printUsage();
      } else if (args.length > 0 && args[0].charAt(0) != '-'){
        System.out.println("Unsupported argument");
      } else if (args[0].contains("-l")) {
        toDoList.printToDo();
      } else if (args[0].contains("-a")) {
        toDoList.addToDo(args);
      } else if (args[0].contains("-r")) {
        toDoList.removeToDo(args);
      } else if (args[0].contains("-c")) {
        toDo.checkToDo(args);
      }
    }
}