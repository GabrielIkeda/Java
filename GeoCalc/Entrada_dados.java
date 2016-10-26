import java.util.*;

public class Entrada_dados 
{
    Integer resp;
    FormaGeometrica formg;
    
    public void Leitura_Dados()
    {
        do
        {
            System.out.printf("\n\r======== CALCULOS GEOMÉTRICOS ========");
            System.out.printf("\n( 1 ) - Polígunos Regulares");
            System.out.printf("\n( 2 ) - Circulos");
            System.out.printf("\nResposta: ");
            this.resp = Integer.parseInt((new Scanner(System.in)).nextLine());
            
            formg = getForma();
            formg.Dados();
            
        }while(resp.equals("1"));
    }
    
    public FormaGeometrica getForma()
    {
        switch(resp)
        {
            case 1:
                return new Poligono();
            case 2:
                return new Circulo();
        }return formg;
    }
}
