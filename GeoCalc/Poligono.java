import java.util.*;
import java.awt.Point;

public class Poligono extends FormaGeometrica
{
    private double tamLado;
    private int numLados; 
    private double p;
    private double A;

    
    public double CalcularPerimetro()
    {
      p = numLados * tamLado;
      return(p);
    }
    
    public double CalcularArea()
    {
        A = (p * raio)/2;
        return (A);
    }
    
    public void Dados()
    {
        System.out.printf("\nTamanho do lado: ");
        this.tamLado = (new Scanner(System.in)).nextDouble();
        System.out.printf("\nNúmero de lados: ");
        this.numLados = (new Scanner(System.in)).nextInt();
        System.out.printf("\nRaio: ");
        raio = (new Scanner(System.in)).nextDouble();
        System.out.printf("\nEixo X: ");
        this.x_p = (new Scanner(System.in)).nextInt();
        System.out.printf("\nEixo Y: ");
        this.y_p = (new Scanner(System.in)).nextInt();
        
        ponto.x = x_p;
        ponto.y = y_p;  
        
        double P = CalcularPerimetro();
        double A = CalcularArea();
        
        System.out.printf("\nPerímetro: "+P);
        System.out.printf("\nÁrea: "+A+"\n");
    }

}
