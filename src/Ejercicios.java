import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("¿Cómo te llamas?");
            String nombre = entrada.nextLine(); // Usar nextLine para capturar el nombre completo

            System.out.println("¿A qué curso vas?");
            String curso = entrada.nextLine(); // También usar nextLine para el curso

            System.out.println("Hola " + nombre + ", bienvenido a " + curso);

            System.out.println("Introduce un número...");
            int num1 = entrada.nextInt();

            System.out.println("Introduce otro número...");
            int num2 = entrada.nextInt();

            int resultado = num1 + num2;

            System.out.println("El resultado de la suma es: " + resultado);
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        } finally {
            entrada.close(); // Cerrar el Scanner al final
        }
    }
}
