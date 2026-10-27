/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo_errores;

/**
 *
 * @author Rodrigo
 */
public class Metodo_Errores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Errores e = new Errores();
        e.calculadora(2, 10, 4);
        e.calculadora(0, 10, 4);
        e.calculadora(2, -1, 4);
    }

}
