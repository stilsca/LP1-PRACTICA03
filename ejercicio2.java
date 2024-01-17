// @author Stilver Scavone
package practica3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla, result;
        System.out.println("Que tabla que seas Mostrar?");
        tabla = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            result = tabla * i;
            System.out.println(tabla + "X" + i + "=" + result);
        }
        scanner.close();
    }
}
