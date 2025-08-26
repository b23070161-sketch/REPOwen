package moneda1;
import java.util.Scanner;

public class MONEDA1 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Bienvenido al sistema de cambios en eurOS, introduce una cantidad de dinero y el programa te dara el cambio que deberas dar.");
        System.out.print("CANTIDAD: ");
        
        Caja caja = new Caja(denominaciones, sc);
        Cambio cambio = new Cambio(caja);
        while (true) 
        {
            int cantidad = sc.nextInt();
            if (cantidad == 0) break;
            cambio.calcularCambio(cantidad);
        }
        sc.close();
    }
}