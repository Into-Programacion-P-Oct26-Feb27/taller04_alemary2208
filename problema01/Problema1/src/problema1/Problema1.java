/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoTotal;
        
        System.out.println("Ingrese Proyecto 1:");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese Gasto del Proyecto 1:");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese Proyecto 2:");
        proyecto2 = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese Gasto del Proyecto 2:");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingrese Proyecto 3:");
        entrada.nextLine();
        proyecto3 = entrada.nextLine();
        System.out.println("Ingrese Gasto del Proyecto 3:");
        gasto3 = entrada.nextDouble();
        
        System.out.println("Ingrese Gasto Total:");
        gastoTotal = gasto1 + gasto2 + gasto3;
        
        System.out.printf("Proyecto1: %s\nGasto 1:%.2f\n\n"
                + "Proyecto 2:%s\nGasto 2: %.2f\n\n" + "Proyecto 3: %s\nGasto 3: %.2f\n\n"
                + "Gasto Total: %s\n",
                proyecto1,
                gasto1,
                proyecto2,
                gasto2,
                proyecto3,
                gasto3,
                gastoTotal);
        
    }
    
}
