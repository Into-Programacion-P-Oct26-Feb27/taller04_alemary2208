/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        String cliente;
        double cpu;
        double pantalla;
        double raton;
        double teclado;
        double costoBase;
        double costo15;
        double costoTotal;
        String valoresIni;
        
        
        System.out.println("Ingrese Nombre del cliente:");
        cliente = entrada.nextLine();
        System.out.println("Ingrese Valor de CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese Valor de Pantalla:");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese Valor del Ratón:");
        raton = entrada.nextDouble();
        System.out.println("Ingrese Valor del Teclado:");
        teclado = entrada.nextDouble();
        
            
        System.out.println("Costo Base Total:");
        costoBase = cpu + pantalla + raton + teclado;
        System.out.println("Costo adicional del 15%:");
        costo15 = costoBase * 0.15;
        System.out.println("Costo Total:");
        costoTotal = costoBase + costo15;
        
        System.out.printf("Reporte:\n"
                + "Nombres de cliente: %s\n"
                + "Valores iniciales:\n"
                + "CPU: $ %.2f\n"
                + "Teclado: $ %.2f\n"
                + "Ratón: $ %.2f\n"
                + "Pantalla: $ %.2f\n\n"
                + "Costo base: $ %.2f\n"
                + "Costo adicional del 15%%: %.2f\n"
                + "Costo final: $ %.2f\n",
                cliente,
                cpu,
                teclado,
                raton,
                pantalla,
                costoBase,
                costo15,
                costoTotal);
   
    }
    
}
