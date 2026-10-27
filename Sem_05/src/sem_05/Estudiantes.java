/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem_05;

/**
 *
 * @author Rodrigo
 */
public class Estudiantes {

    public void Registrar(String nombre, String apellido) {
        String rpta = nombre + " - " + apellido;
        System.out.println("SU NOMBRE COMPLETO ES: " + rpta);
    }

    public void Registrar(int codigo, String correo) {
        String rpta = codigo + " - " + correo;
        System.out.println("CÓDIGO DE ESTUDIANTE -- CORREO :" + rpta);
    }

    public void Registrar(int dni, int ciclo) {
        System.out.println("CICLO - DNI :" + ciclo + " -- " + dni);
    }
}
