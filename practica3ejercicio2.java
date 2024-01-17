package practica3;

import java.util.Scanner;

// @author Stilver Scavone

public class practica3ejercicio2 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            String usuario;
            String usuarioCorrecto = "admin";
            int pin;
            int pincorrecto = 1234567;
            int correcto = 0;
            System.out.println("Acceso al sistema");
            while (correcto <= 0) {
                System.out.print("Ingrese usuario:  ");
                usuario = scanner.nextLine();
                System.out.print("Ingrese pin:   ");
                pin = scanner.nextInt();
                if ((usuario.equals(usuarioCorrecto)) && (pin == pincorrecto)) {
                    correcto = 1;
                }
                System.out.println("Usuario y/o pin incorecto  ");
                scanner.nextLine();
            }
            System.out.println("Bienvenido al sistema  ");
            scanner.close();
        }
    }

}
