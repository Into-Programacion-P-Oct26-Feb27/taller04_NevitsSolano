


import java.util.Scanner;
import java.util.Locale;

public class Problema03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String titular;
        String direccion;
        double costoPorMinuto;
        double minutosConsumidos;
        double valorTotal;

        System.out.println("Ingrese el nombre del titular:");
        titular = entrada.nextLine();
        
        System.out.println("Ingrese la dirección:");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese el costo por minuto:");
        costoPorMinuto = entrada.nextDouble();
        
        System.out.println("Ingrese los minutos consumidos:");
        minutosConsumidos = entrada.nextDouble();

        valorTotal = costoPorMinuto * minutosConsumidos;

        System.out.printf("==================================================\n"
                + "PLANILLA DE SERVICIO TELEFÓNICO\n"
                + "==================================================\n"
                + "Titular: %s\n"
                + "Dirección: %s\n"
                + "---------------------------------------------------\n"
                + "Costo por minuto: $%.2f\n"
                + "Minutos consumidos: %.0f\n"
                + "---------------------------------------------------\n"
                + "VALOR TOTAL A PAGAR: $%.2f\n"
                + "==================================================\n", 
                titular, 
                direccion, 
                costoPorMinuto, 
                minutosConsumidos, 
                valorTotal);
    }
}