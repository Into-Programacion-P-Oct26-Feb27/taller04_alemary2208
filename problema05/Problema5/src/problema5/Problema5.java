/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;
import java.util.Locale;
import java.util.Scanner;
/**
*@author SALASC
 */
public class Problema5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        String nombreCliente;
        double netflix;
        double youtubePremium;
        double dropbox;
        double spotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify;
        double des_descuentoNetflix;
        double des_descuentoYoutube;
        double des_descuentoDropbox;
        double des_descuentoSpotify;
        double cost_sinDescuento;
        double ahorro;
        double valorTotal;
        
        System.out.println("Ingrese Nombre del cliente:");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese Valor de Netflix:");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese Valor de YouTube Premium:");
        youtubePremium = entrada.nextDouble();
        System.out.println("Ingrese Valor de DropBox:");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese Valor de Spotify:");
        spotify = entrada.nextDouble();    
        System.out.println("Descuento Nexflix:");
        descuentoNetflix = netflix * 0.23;
        System.out.println("Descuento YouTube Premium:");
        descuentoYoutube = youtubePremium * 0.23;
        System.out.println("Descuento DropBox:");
        descuentoDropbox = dropbox * 0.45;
        System.out.println("Descuento Spotify:");
        descuentoSpotify = 0;
        System.out.println("Netflix con descuento:");
        des_descuentoNetflix = netflix - descuentoNetflix;
        System.out.println("YouTube Premium con descuento:");
        des_descuentoYoutube = youtubePremium - descuentoYoutube;
        System.out.println("DropBox con descuento:");
        des_descuentoDropbox = dropbox - descuentoDropbox;
        System.out.println("Spotify con descuento:");
        des_descuentoSpotify = spotify - descuentoSpotify;
        System.out.println("Costo sin Descuento:");
        cost_sinDescuento = netflix + youtubePremium + dropbox + spotify;
        System.out.println("Ahorro Mensual:");
        ahorro = descuentoNetflix + descuentoYoutube + descuentoDropbox + descuentoSpotify;   
        System.out.println("Valor que debera pagar mensualmente:");
        valorTotal = des_descuentoNetflix + des_descuentoYoutube + des_descuentoDropbox + des_descuentoSpotify;        
                
        System.out.printf("Nombres de cliente: %s\n"
                + "Netflix: $ %.2f\n" + "YouTube Premium: $ %.2f\n"
                + "DropBox: $ %.2f\n" + "Spotify: $ %.2f\n\n"
                + "Descuento Nexflix: $ %.2f\n" + "Descuento YouTube Premium: %.2f\n"
                + "Descuento DropBox: $ %.2f\n" + "Descuento Spotify: $ %.2f\n" 
                + "Netflix con descuento: $ %.2f\n" + "YouTube Premium con descuento: $ %.2f\n"
                + "DropBox con descuento: $ %.2f\n" + "Spotify con descuento: $ %.2f\n"
                + "Costo sin Descuento: $ %.2f\n" + "Ahorro Mensual: $ %.2f\n" 
                + "Valor que debera pagar mensualmente: $ %.2f\n",
                nombreCliente, netflix, youtubePremium, dropbox, spotify,
                descuentoNetflix, descuentoYoutube, descuentoDropbox, descuentoSpotify,
                des_descuentoNetflix, des_descuentoYoutube, des_descuentoDropbox, des_descuentoSpotify,
                cost_sinDescuento, ahorro, valorTotal);
    }
    
}
