import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
          // https://www.youtube.com/watch?v=rUweIU5UuW0&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=92
		  
          // \d - busca todos os digitos
          // \D - tudo o que não for digito
          // \s - espaços em brancos \t \n \f \r
          // \S - caracteres que não possuem espaçoa em branco
          // \w - caracteres de palavras a-z  A-Z, digitos e _    
          // \W - caracteres que não são palavras 
          // []
        
		  //   int numeroHex=0X100F;
		
		  /* essa expressão quer dizer iniciado com 0,
		     pode conter x minúsculo e X maiúsculo, deve conter de zero a nove,
			 letras a a f minúsculos e A a F maiúsculos.
		  */
          String regex="0[xX] [0-9a-fA-F]";
          String texto="12 0x 0X 0xFFABC 0x106 0x1";
          
          Pattern pattern=Pattern.compile(regex);
          Matcher matcher=pattern.matcher(texto);
          
          System.out.println("texto:" + texto);
          System.out.println("indice: 0123456789");
          System.out.println("expressão: " + matcher.pattern());
          System.out.println("posição encontrada");
            
          while(matcher.find()){
              System.out.println(matcher.start());
              System.out.println(matcher.group());
          }
          
        //   System.out.println(numeroHex);
            
    }
}
