


import java.util.Scanner;
import java.util.Locale;

public class Problema01 {

    public static void main(String[] args) {
        
        // Inicializamos el Scanner
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String Proyecto1;
        String Proyecto2;
        String Proyecto3;
        
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoMensual;

        System.out.println("Ingrese el nombre del proyecto 1:");
        Proyecto1 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual 1:");
        gasto1 = entrada.nextDouble();
        entrada.nextLine(); 

        
        System.out.println("Ingrese el nombre del proyecto 2:");
        Proyecto2 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual 2:");
        gasto2 = entrada.nextDouble();
        entrada.nextLine(); 

        
        System.out.println("Ingrese el nombre del proyecto 3:");
        Proyecto3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual 3:");
        gasto3 = entrada.nextDouble();

        
        gastoMensual = gasto1 + gasto2 + gasto3;

        
        System.out.printf("Reporte generado:\n"
                + "CONTROL DE GASTOS DE PROYECTOS\n"+ "Proyectos:\n"
                + "-------------------------------\n"+ "1. %s: $%.2f\n"
                + "2. %s: $%.2f\n"+ "3. %s: $%.2f\n"
                + "-------------------------------\n"+ "GASTO MENSUAL TOTAL: "
                + "$%.2f\n", 
                Proyecto1, 
                gasto1, 
                Proyecto2, 
                gasto2, 
                Proyecto3, 
                gasto3, 
                gastoMensual);
    }
}
