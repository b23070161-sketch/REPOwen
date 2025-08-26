package moneda1;
import java.util.Scanner;

public class MONEDA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Bienvenido al sistema de cambios en eurOS, introduce una cantidad de dinero y el programa te dara el cambio que deberas dar.");
        System.out.print("CANTIDAD: ");
        System.out.print("Prueba de conexion con Github");

        while (true) {
            int cantidad = sc.nextInt();
            if (cantidad == 0) break;

            System.out.println(cantidad);

            for (int i = 0; i < denominaciones.length; i++) {
                if (cantidad >= denominaciones[i]) {
                    int num = cantidad / denominaciones[i];
                    System.out.println(num + "de " + denominaciones[i]);
                    cantidad = cantidad % denominaciones[i];
                }
            }
            System.out.print("CANTIDAD: ");
        }

        sc.close();
    }
}