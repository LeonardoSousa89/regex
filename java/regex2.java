import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
		
		  //https://www.youtube.com/watch?v=rY6sA1vdSPA&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=91
		
          // \d - busca todos os digitos
          // \D - tudo o que não for digito
          // \s - espaços em brancos \t \n \f \r
          // \S - caracteres que não possuem espaçoa em branco
          // \w - caracteres de palavras a-z  A-Z, digitos e _    
          // \W - caracteres que não são palavras 
        
          String regex="\\W";
          String texto="mano \r ";
          
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