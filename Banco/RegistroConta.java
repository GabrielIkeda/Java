package bankpackage;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;

public class RegistroConta 
{

    Scanner read = new Scanner(System.in);
    
    private Integer regQtdConta;
    private ContaBancaria[] regListadeContas;
    private Cliente[] regListadeClientes;
    private int I;
    
    public void entradaConta() throws IOException
    {

        System.out.printf("Entre com a quantidade de contas que deseja cadastrar: ");
        this.regQtdConta = Integer.parseInt(read.nextLine());
        regListadeContas = new ContaBancaria[regQtdConta];
        regListadeClientes = new Cliente[regQtdConta];
        Arquivo escrita = new Arquivo();
             
        for(I = 0; I < regQtdConta; I++)
        {
            Boolean contResposta;
            regListadeClientes[I] = new Cliente();
            regListadeContas[I] = new ContaBancaria(regListadeClientes[I]);   
            System.out.println("Deseja realizar um investimento? [SIM] = true [NÃO] = false");
            contResposta = read.nextBoolean();
        
            if(contResposta)
            {
                regListadeContas[I].Investimento();
                regListadeContas[I].Calcular();
            }
            else
            {
            System.out.println("Obrigado pela paciência");
            }
             
            
        }
       
       
        
    }
    
    public void mostrarLista() throws IOException
    {
        Arquivo arq = new Arquivo();
        for(I = 0; I < regQtdConta; I++)
        {
            /*System.out.println("-----------DADOS-----------");
            System.out.println("Titular da conta: "+this.regListadeContas[I].getTitular().getNome());
            System.out.println("Numero da conta: "+this.regListadeContas[I].getNumeroConta());
            System.out.println("Senha da conta: "+this.regListadeContas[I].getSenha());
            System.out.println("CPF: "+this.regListadeContas[I].getTitular().getCPF());
            System.out.println("Telefone do cliente: "+this.regListadeContas[I].getTitular().getTelefone());
            */
            arq.Le(regListadeContas[I].getRegistro());

        }
        
        
    }
    
    
}
