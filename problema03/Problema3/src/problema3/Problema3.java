/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);    
        // TODO code application logic here
    String cliente;
    String direccion;
    double costoMinuto;
    int minutosConsumidos;
    double totalPagar;
    
        System.out.println("Ingrese Titular:");
        cliente = entrada.nextLine();
        System.out.println("Ingrese Direccion:");
        direccion = entrada.nextLine();
        System.out.println("Ingrese el Costo por Minuto:");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese Minutos Consumidos:");
        minutosConsumidos = entrada.nextInt();

        
        System.out.println("Ingrese el Total a pagar:");
        totalPagar = costoMinuto * minutosConsumidos;
        
        System.out.printf("Titular: %s\n"
                + "Direccion: %s\n" + "Costo por Minuto: %.2f\n"
                + "Minutos consumidos: %d\n"
                + "Gasto Total: %s\n",
                cliente,
                direccion,
                costoMinuto,
                minutosConsumidos,
                totalPagar);
    }
    
}
