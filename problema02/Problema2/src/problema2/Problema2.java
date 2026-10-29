/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
        // TODO code application logic here

    double ancho;
    double alto;
    double areaTriang;
    
    System.out.println("Ingrese el ancho del Triangulo:");
    ancho = entrada.nextDouble();
    System.out.println("Ingrese la altura del Triangulo:");
    alto = entrada.nextDouble();
    entrada.nextLine();
    
    areaTriang = (ancho * alto) / 2;
    
    System.out.printf("Area del Triangulo: %.2f\n",
                ancho,
                alto,
                areaTriang);
    }
    
}
