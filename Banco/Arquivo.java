package bankpackage;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    
    void Escreve(String texto) throws IOException
    {
        FileWriter arquivo = new FileWriter("dados.txt", true);
        BufferedWriter buff = new BufferedWriter(arquivo);
        buff.append(texto);
        buff.newLine();
        buff.newLine();
        buff.close();
    }
    
    void Le(String texto) throws IOException
    {
        BufferedReader buffRead = new BufferedReader(new FileReader("dados.txt"));
        String linha = "";
        
        while(buffRead.ready())
        {
            linha = buffRead.readLine();
            System.out.println(linha);
        }
        buffRead.close();
    }
    
}
