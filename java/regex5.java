import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
        
          // \d - busca todos os digitos
          // \D - tudo o que não for digito
          // \s - espaços em brancos \t \n \f \r
          // \S - caracteres que não possuem espaçoa em branco
          // \w - caracteres de palavras a-z  A-Z, digitos e _    
          // \W - caracteres que não são palavras 
          
          // []- deve conter
          
          // ? - zero ou uma ocorrência
          // * - zero ou mais ocorrências
          // + - uma ou mais ocorrências
          // {n,m} - de n a m ocorrências
          // ( )   - agrupar(criar grupos)
          // | - significa ou como no operador relacional
          // $ - fim da linha
          
          int hex=0X10;
          
          /* essa expressão quer dizer iniciado com 0,
		     pode conter x minúsculo e X maiúsculo, deve conter de zero a nove,
			 letra a a f minúsculos e A a F maiúsculos um ou mais vezes seguido 
			 de espaços em branco ou fim de linha.
		  */
          String regex="0[xX]([0-9a-fA-F])+(\\s|$)";
          String texto="12 0x 0X 0x01FFABC 0x10G 0x1";
          
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
          
          System.out.println("hex:" + hex);
            
    }
}
