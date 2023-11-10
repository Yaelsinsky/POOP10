/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Yael Camarena
 */
/**
 * Clase principal que demuestra el manejo de excepciones en Java.
 */
public class POOP10 {

    /**
     * Método principal donde se ejecuta el programa.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Hola pibitos");

        // Manejo de ArrayIndexOutOfBoundsException
        String[] mensaje = {"Primero", "Segundo", "Tercero"};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("Mensaje " + mensaje[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Hola mundo2");

        // Manejo de ArithmeticException
        try {
            double x = 0 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Hola mundo 3");
    }
}