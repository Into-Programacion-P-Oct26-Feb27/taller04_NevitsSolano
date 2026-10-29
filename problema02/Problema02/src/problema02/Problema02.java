






import java.util.Scanner;
import java.util.Locale;

public class Problema02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        
        System.out.println("Ingrese la base del triángulo:");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo:");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("El área del triángulo es: %.2f\n", area);
    }
}
