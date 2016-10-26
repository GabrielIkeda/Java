
import java.awt.Point;
import java.util.Scanner;

public abstract class FormaGeometrica 
{
    protected double raio;
    protected double centro;
    protected int x_p;
    protected int y_p;
    protected Point ponto = new Point();
    
    public abstract double CalcularArea();
    
    public abstract double CalcularPerimetro();
    
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
    }
        
}
