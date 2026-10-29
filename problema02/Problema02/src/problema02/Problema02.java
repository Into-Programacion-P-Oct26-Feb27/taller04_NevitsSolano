






import java.util.Scanner;
import java.util.Locale;

public class Problema02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Declarar las variables
        double base;
        double altura;
        double area;

        // Pedir los datos
        System.out.println("Ingrese la base del triángulo:");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo:");
        altura = entrada.nextDouble();

        // Calcular el área (base * altura / 2)
        area = (base * altura) / 2;

        // Imprimir el resultado
        System.out.printf("El área del triángulo es: %.2f\n", area);
    }
}