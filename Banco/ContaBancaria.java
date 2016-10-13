package bankpackage;
import java.util.*;
import java.io.IOException;

public class ContaBancaria {
    
    Scanner read = new Scanner(System.in);
    
    private Cliente contTitular;
    private String contNumero;
    private Integer contSenha;
    
    private double contSaldo;
   
    private Integer contTempo;
    private double contSaldoTotal;
    private float contJuros;
    
    private String registro = "";

    public Cliente getTitular() 
    {
        return contTitular;
    }

    public String getNumeroConta() 
    {
        return contNumero;
    }

    public double getSaldo() 
    {
        return contSaldo;
    }
    
    public Integer getSenha()
    {
        return contSenha;
    }
    
    
    
    public void setSaldo(double novoSaldo){
        this.contSaldo = novoSaldo;
    }
    
    public void setNumeroConta(String novoNumero){
        this.contNumero = novoNumero;
    }
    
    public void setTitular(Cliente novoTitular){
        this.contTitular = novoTitular;
    }
    
    public void Sacar(double quantidade)
    {
        if(quantidade > contSaldo){
            System.out.println("Erro!Seu saldo é de: "+contSaldo);
            System.out.println("Valor desejado: "+quantidade);
        }
        else{
            double novoSaldo = this.contSaldo - quantidade;
            this.contSaldo = novoSaldo;
        }
    }
    
    public void Calcular()
    {
        contSaldoTotal = Math.pow(1 + contJuros, contTempo) * contSaldo; 
        System.out.println("Irá render: "+contSaldoTotal);
    }
    
    public void Depositar(double quantidade)
    {
        this.contSaldo += quantidade;
    }
    
    public void Investimento()
    {
        //-------------- ENTRADA INVESTIMENTO ------------------
        System.out.println("Entre com o valor para investir: ");
        this.contSaldo = Double.parseDouble(read.nextLine());
        
        System.out.println("Entre com o tempo que irá permanecer: ");
        this.contTempo = Integer.parseInt(read.nextLine());
        
        System.out.println("Entre com o juros: ");
        this.contJuros = Float.parseFloat(read.nextLine());
    }
    
    ContaBancaria(Cliente regListadeClientes) throws IOException
    {
        
        Arquivo arq = new Arquivo();
        
        Boolean contResposta;
        
        
        
        System.out.printf("Entre com o numero da conta: ");
        this.contNumero = read.nextLine();
        
        System.out.printf("Entre com a senha: ");
        this.contSenha = Integer.parseInt(read.nextLine());
        
        this.contTitular = regListadeClientes;
        
        registro =  "CPF: " + (regListadeClientes.getCPF())+ 
                    "\r\nNome: " + (regListadeClientes.getNome())+
                     regListadeClientes.getRegistroend()+ 
                    "\r\nTelefone: " + (regListadeClientes.getTelefone())+
                    "\r\nNumero da conta: " + (this.contNumero);
        arq.Escreve(registro);
        
               
    }

    public String getRegistro() {
        return registro;
    }
    
    
}
