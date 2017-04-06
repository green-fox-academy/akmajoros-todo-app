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
      }

      if (Arrays.toString(args).contains("-l")) {
        toDoList.printToDo();
      }

      if (Arrays.toString(args).contains("-a")) {
        toDoList.addToDo(args);
      }

      if (Arrays.toString(args).contains("-r")) {
        toDoList.removeToDo(args);
      }

      if (Arrays.toString(args).contains("-c")) {
        toDo.checkToDo(args);
      }
    }
}