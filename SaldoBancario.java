/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1.davi.angelo.java;

/**
 *
 * @author Oem
 */
public class SaldoBancario {
    public double saldo;
    public double Sdolar;
    
        public SaldoBancario(double saldo,double Sdolar){
            this.saldo = saldo;
            this.Sdolar = Sdolar;
        }
        
        public void Saldo(double saldo,double Sdolar){
            System.out.println("Saldo em reais: R$" + saldo+"0");
            System.out.println("Saldo em dólar: US$" + Sdolar+"0");
        }
}
