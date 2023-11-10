/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Yael Camarena
 */
/**
 * Excepción personalizada para manejar situaciones de saldo insuficiente.
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Constructor por defecto.
     * Inicializa la excepción con un mensaje predeterminado de "Saldo Insuficiente".
     */
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }

    /**
     * Constructor que permite especificar un mensaje de error personalizado.
     *
     * @param message Mensaje personalizado para la excepción.
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}