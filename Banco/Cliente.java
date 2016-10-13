package bankpackage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

public class Cliente {
    Scanner read = new Scanner(System.in);
    
    private String contNome;
    private String contCPF;
    private String contTelefone;
    private Integer contQtdEndereco;
    private String[] contEndereco; 
    private Integer contPosicao;
    private String registroend = "\n";
    
    public String entradaEndereco()
    {
        contEndereco = new String[contQtdEndereco];
        int I;
        
        for(I = 0; I < this.contQtdEndereco; I++)
        {
            contEndereco[I] = new String();
            System.out.printf("Entre com o " + (I+1) + "º endereço:");
            this.contEndereco[I] = read.nextLine();
        
        }
        for(I = 0; I < this.contQtdEndereco; I++)
        {
        registroend += "\r\nEndereço " + (I+1) + ": " +(this.contEndereco[I]);
        }
        
        return (registroend);
    }
    
    public void setNome(String novoNome)
    {
        this.contNome = novoNome;
    }

    public String getRegistroend() {
        return registroend;
    }
    
    
    
    public void setCPF(String novoCPF)
    {
        this.contCPF = novoCPF;
    }

    public Integer getContQtdEndereco() {
        return contQtdEndereco;
    }
    
    public void setTelefone(String novoTelefone)
    {
        this.contTelefone = novoTelefone;
    }
    
    public String getNome()
    {
        return contNome;
    }
    
    public String getCPF()
    {
        return contCPF;
    }
    
    public String getTelefone()
    {
        return contTelefone;
    }
    
    public String getEnderecos()
    {
        System.out.printf("Qual endereço deseja observar? ");
        this.contPosicao = Integer.parseInt(read.nextLine());
        return contEndereco[contPosicao - 1];
    }
    
    
    Cliente ()
    {
        System.out.printf("Entre com o nome:");
        this.contNome = read.nextLine();
        
        System.out.printf("Entre com a quantidade de endereços:");
        this.contQtdEndereco = Integer.parseInt(read.nextLine());
        
        entradaEndereco();
        
        System.out.printf("Entre com o telefone:");
        this.contTelefone = read.nextLine();
        
        System.out.printf("Entre com o CPF:");
        this.contCPF = read.nextLine();
        
    }
    
}
