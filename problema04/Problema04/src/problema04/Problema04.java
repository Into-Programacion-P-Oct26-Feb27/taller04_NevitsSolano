






import java.util.Scanner;
import java.util.Locale;

public class Problema04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreCliente;
        double costoCpu;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        
        double costoBase;
        double costoAdicional;
        double costoFinal;

        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese el costo de la CPU:");
        costoCpu = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Teclado:");
        costoTeclado = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Ratón:");
        costoRaton = entrada.nextDouble();
        
        System.out.println("Ingrese el costo de la Pantalla:");
        costoPantalla = entrada.nextDouble();

        costoBase = costoCpu + costoTeclado + costoRaton + costoPantalla;
        
        costoAdicional = costoBase * 0.15; 
        
        costoFinal = costoBase + costoAdicional;

        System.out.printf("Reporte:\n"+ "Nombres de cliente: %s\n"
        + "Valores iniciales:\n"+ "CPU: $ %.1f\n"+ "Teclado: $ %.1f\n"
        + "Ratón: $ %.1f\n"+ "Pantalla: $ %.1f\n"+ "\n"+ "Costo base: $ %.0f\n"
        + "Costo adicional del 15%%: %.2f\n"+ "Costo final: $ %.2f\n", 
                
                nombreCliente, 
                costoCpu, 
                costoTeclado, 
                costoRaton, 
                costoPantalla, 
                
                costoBase, 
                costoAdicional, 
                costoFinal);
    }
}