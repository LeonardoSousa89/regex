import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
        
          //https://www.youtube.com/watch?v=LfT1kT64cFQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=94	
        
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
          // {n,m} de n a m ocorrências
          // ( ) agrupar(criar grupos), repetição
          // | significa ou como no operador relacional
          // $ fim da linha
          
          int hex=0X10;
          
          /* essa expressão quer dizer,
		     deve conter a a z minúsculo e A a Z maiúsculo, seguido de underline,
		     . ou traço uma ou mais vezes podendo haver repição, seguido de arroba e após deve conter a a z 
		     minúsculo e A a Z maiúsculo um ou mais vezes podendo haver repição, seguido de ponto e após,
		     deve conter a a z minúsculo e A a Z maiúsculo uma ou mais vezes podendo haver repição.
		  */
          String regex="([a-zA-z\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";
          String texto="@3#adsa@asdas.br gig._i@adfas.com mano@gmail.com, bicho@outlook.com, doido@hotmail.com, 104fm@ask.com 104fm@ask.com.br";
          
          System.out.println("Email válido?: " + "@3#adsa@asdas.br".matches(regex));
          System.out.println("Email válido?: " + "bicho@outlook.com".matches(regex));
          System.out.println(" ");
            
          Pattern pattern=Pattern.compile(regex);
          Matcher matcher=pattern.matcher(texto);
          
          System.out.println("texto:" + texto);
          System.out.println("indice: 0123456789");
          System.out.println("expressão: " + matcher.pattern());
          System.out.println("posição encontrada");
            
          System.out.println(" ");
          
          while(matcher.find()){
         
              System.out.println(matcher.start() + " " + matcher.group());
         
          }
        
          System.out.println(" ");
          
          System.out.println("hex:" + hex);
            
    }
}
