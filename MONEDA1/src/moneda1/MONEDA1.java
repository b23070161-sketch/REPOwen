package moneda1;
import java.util.Scanner;

public class MONEDA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] disponibles = new int[denominaciones.length];

        System.out.println("Bienvenido al sistema de cambios en eurOS.");
        System.out.println("Introduce cuantos billetes y monedas tienes de cada denominacion:");

        for (int i = 0; i < denominaciones.length; i++) {
            System.out.print("Cantidad disponible de: " + denominaciones[i] + ": ");
            disponibles[i] = sc.nextInt();
        }

        System.out.println("\nIntroduce una cantidad para dar cambio (0 para salir):");

        while (true) {
            System.out.print("CANTIDAD: ");
            int cantidad = sc.nextInt();
            if (cantidad == 0) break;

            System.out.println("Cambio para " + cantidad + ":");

            for (int i = 0; i < denominaciones.length; i++) {
                if (cantidad >= denominaciones[i] && disponibles[i] > 0) {
                    int num = Math.min(cantidad / denominaciones[i], disponibles[i]);
                    if (num > 0) {
                        System.out.println(num + " de " + denominaciones[i]);
                        cantidad -= num * denominaciones[i];
                        disponibles[i] -= num;
                    }
                }
            }

            if (cantidad > 0) {
                System.out.println("⚠️ No se pudo dar cambio exacto. Faltan " + cantidad + " euros.");
            }

            System.out.println();
        }

        sc.close();
    }
}