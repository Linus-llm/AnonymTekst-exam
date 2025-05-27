import java.util.ArrayList;

public class StringHandler {

    public String replaceText(String originalText, ArrayList<String> listOfNames){

        String regex = "(?i)"+listOfNames.getFirst();
        String tmp="";
       for(int i = 0; i<listOfNames.size();i++){
           if(i!=0 && i<=listOfNames.size()-1){
               regex += "|"+listOfNames.get(i);
           }
           tmp = originalText.replaceAll(regex, "Den Studerende");

       }

        return tmp;
    }
}
