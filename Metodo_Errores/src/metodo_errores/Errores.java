/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_errores;

/**
 *
 * @author Rodrigo
 */
public class Errores {

    public void calculadora(int a, int b, int c) {
        try {
            if (a >= 0 && b > 0 && c > 0) {
                int rpta = (b - c) / a;
                System.out.println("La respuesta de la operación (b - c) / a es: " + rpta);
            } else {
                // Si los valores no cumplen la condición, mostrar el mensaje
                System.out.println("Error de ingreso");
            }
        } catch (Exception e) {
            // Si ocurre una excepción (como división por cero), mostrar el mismo mensaje
            System.out.println("Error de ingreso al colocar el valor para la variable a ");
        }
    }
}
