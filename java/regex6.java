import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
        
          //https://www.youtube.com/watch?v=NHejMxwN2wc&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=96
        
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
		  
		  // ^ não deve conter, negação
          
          int hex=0X10;
      
          String regex="([a-zA-Z])+([2-9])+(\\.([a-zA-Z])+)";                   //somente proj a partir de 2
          String texto="proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java";
          
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
