/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero_consola;

/**
 *
 * @author Marco
 */
public class saldo {
    private double saldo;

    public saldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void retirarSaldo(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

}
