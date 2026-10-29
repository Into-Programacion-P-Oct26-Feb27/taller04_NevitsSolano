


import java.util.Scanner;
import java.util.Locale;

public class Problema05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreCliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify; 
        
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        
        double totalSinDescuentos;
        double totalAhorro;
        double totalAPagar;


        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese el precio mensual de Netflix:");
        precioNetflix = entrada.nextDouble();
        
        System.out.println("Ingrese el precio mensual de YouTube Premium:");
        precioYoutube = entrada.nextDouble();
        
        System.out.println("Ingrese el precio mensual de Dropbox:");
        precioDropbox = entrada.nextDouble();
        
        System.out.println("Ingrese el precio mensual de Spotify:");
        precioSpotify = entrada.nextDouble();


        descuentoNetflix = precioNetflix * 0.23;
        descuentoYoutube = precioYoutube * 0.23;
        descuentoDropbox = precioDropbox * 0.45;
        descuentoSpotify = 0.0; 

        
        finalNetflix = precioNetflix - descuentoNetflix;
        finalYoutube = precioYoutube - descuentoYoutube;
        finalDropbox = precioDropbox - descuentoDropbox;
        finalSpotify = precioSpotify - descuentoSpotify;

        
        totalSinDescuentos = precioNetflix + precioYoutube + precioDropbox 
        + precioSpotify;totalAhorro = descuentoNetflix + descuentoYoutube 
        + descuentoDropbox + descuentoSpotify;totalAPagar = finalNetflix 
        + finalYoutube + finalDropbox + finalSpotify;

        
        System.out.printf("\n--- REPORTE DE SERVICIOS DIGITALES ---\n"
        + "Cliente: %s\n\n"
        + "1. Netflix (23%% de descuento):\n"
        + "   Precio original: $%.2f | Descuento: $%.2f | Precio final: $%.2f\n"
        + "2. YouTube Premium (23%% de descuento):\n"
        + "   Precio original: $%.2f | Descuento: $%.2f | Precio final: $%.2f\n"
        + "3. Dropbox (45%% de descuento):\n"
        + "   Precio original: $%.2f | Descuento: $%.2f | Precio final: $%.2f\n"
        + "4. Spotify (Sin descuento):\n"
        + "   Precio original: $%.2f | Descuento: $%.2f | Precio final: $%.2f\n"
        + "--------------------------------------\n"
        + "RESUMEN TOTAL:\n"
        + "Costo mensual total (sin descuentos): $%.2f\n"
        + "Ahorro mensual total: $%.2f\n"
        + "VALOR TOTAL A PAGAR: $%.2f\n", 
                
        nombreCliente,
        
        precioNetflix, descuentoNetflix, finalNetflix,
        precioYoutube, descuentoYoutube, finalYoutube,
        precioDropbox, descuentoDropbox, finalDropbox,
        precioSpotify, descuentoSpotify, finalSpotify,
                
        totalSinDescuentos, 
        totalAhorro, 
        totalAPagar);
    }
}