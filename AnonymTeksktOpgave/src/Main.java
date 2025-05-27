import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String textFromFile = "";
    static StringHandler sh;
    static ArrayList<String> listOfNames = new ArrayList<>();
    public static void main(String[] args) {
        listOfNames.add("Katrine");
        listOfNames.add("Stine");
        listOfNames.add("Joakim");
        listOfNames.add("Anders");
        textFromFile = loadFile();
        sh = new StringHandler();
        System.out.println(sh.replaceText(textFromFile,listOfNames));

    }
    public static String loadFile(){
        String line = "";
        File file = new File("data/Text.txt");

        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scan.hasNextLine()) {
            line += scan.nextLine()+"\n";
        }
        return line;
    }
}
