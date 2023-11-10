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
 * Clase que representa una cuenta bancaria básica.
 * Permite realizar operaciones como depositar y retirar dinero.
 */
public class CuentaBancaria {
    private double saldo; // Saldo actual de la cuenta

    /**
     * Constructor por defecto.
     * Inicializa el saldo de la cuenta en cero.
     */
    public CuentaBancaria() {
        saldo = 0;
    }

    /**
     * Constructor que inicializa la cuenta con un saldo dado.
     *
     * @param saldo Saldo inicial de la cuenta.
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para depositar dinero en la cuenta.
     * Aumenta el saldo por el monto especificado.
     *
     * @param monto Monto a depositar en la cuenta.
     */
    public void depositar(double monto) {
        System.out.println("Depositado: " + monto);
        saldo += monto;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * Disminuye el saldo por el monto especificado.
     * Lanza una SaldoInsuficienteException si el saldo es insuficiente.
     *
     * @param monto Monto a retirar de la cuenta.
     * @throws SaldoInsuficienteException Si el saldo es menor que el monto a retirar.
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando: " + monto);
        if (saldo < monto)
            throw new SaldoInsuficienteException();
        else  
            saldo -= monto;
    }
}