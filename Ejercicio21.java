package practica3;
// @author Stilver Scavone

public class Ejercicio21 {

  public static void main(String[] args) {
    int tabla, result;
    for (tabla = 1; tabla < 11; tabla++) {
      System.out.println("----------------------------------");
      System.out.println("Tabla del: " + tabla);
      System.out.println("---------------------------------");
      for (int i = 1; i < 11; i++) {
        result = tabla * i;
        System.out.println(tabla + "X" + i + " = " + result);
      }
    }
  }
}
