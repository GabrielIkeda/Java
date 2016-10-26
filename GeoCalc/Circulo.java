import java.awt.Point;
import java.util.Scanner;

public class Circulo extends FormaGeometrica 
{
    private double p;
    private double A;
    
    public double CalcularPerimetro()
    {
        p = (2 * raio * Math.PI);
        return(p);
    }
    
    public double CalcularArea()
    {
        A = Math.PI * (Math.pow(raio, 2));
        return(A);
    }
    
    public void Dados()
    {
        System.out.printf("\nRaio: ");
        raio = (new Scanner(System.in)).nextDouble();
        System.out.printf("\nEixo X: ");
        this.x_p = (new Scanner(System.in)).nextInt();
        System.out.printf("\nEixo Y: ");
        this.y_p = (new Scanner(System.in)).nextInt();
        
        ponto.x = x_p;
        ponto.y = y_p;
        
        double A = CalcularArea();
        double P = CalcularPerimetro();
        
        System.out.printf("\nÁrea: "+A);
        System.out.printf("\nPerímetro: "+P+"\n");
        
    }
    
}
