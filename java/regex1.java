import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
		  
		  //https://www.youtube.com/watch?v=-Pmnb_no1bQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=93
		  
          String regex="ab";
          String texto="abaaaba";
          
          Pattern pattern=Pattern.compile(regex);
          Matcher matcher=pattern.matcher(texto);
          
          System.out.println("texto:" + texto);
          System.out.println("indice: 0123456789");
          System.out.println("expressão: " + matcher.pattern());
          System.out.println("posição encontrada");
            
          while(matcher.find()){
              System.out.println(matcher.start() + "");
          }
          
            
    }
}