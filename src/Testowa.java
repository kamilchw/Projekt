
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Testowa {
    
    
    public static void main(String[] args) {
        
        //deklaracje 
        String linia;
        //deklatacje

        List<String> lista = new ArrayList<String>();

        // wczytanie pliku
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj plik");
        String nazwa = skaner.nextLine();
        // wczytanie pliku
        
        
        
        try {
            skaner = new Scanner(new File(nazwa));
            

            while(skaner.hasNextLine()){
                linia = skaner.nextLine();
                StringTokenizer token = new StringTokenizer(linia);
                lista.add(token.nextToken(";"));
                while (token.hasMoreTokens()) {
			lista.add((String) token.nextElement());
                    }//while tokenizer
                
                }// while
            System.out.println(lista);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Pliku nie znaleziono, program kończy pracę");
    }// catch 
        
        System.out.println(lista.size());
        
        lista.remove(0);
        System.out.println(lista.size());
        System.out.println(lista);
        

        
    }
}
