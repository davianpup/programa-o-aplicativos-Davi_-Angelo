/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1.davi.angelo.java;
import java.util.Scanner;

/**
 *
 * @author Oem
 */
public class DepositoBancario {
    public double dep;
    public double saldo;
    
        public DepositoBancario(double dep, double saldo){
            this.dep = dep;
            this.saldo = saldo;
        }
        
        public void Deposito(double dep,double saldo, String[] extrato,int qtdMov){
            Scanner input = new Scanner(System.in);
            do{ 
                System.out.print("Valor do depósito (>0 e <=5000): ");
                dep = input.nextDouble();
                if(dep > 0 && dep <= 5000){
                    saldo += dep;
                    System.out.println("Depósito realizado com sucesso!");

                    extrato[qtdMov] = "DEPÓSITO +R$"+dep+"0";
                    qtdMov++;
                    break;
                }else{
                    System.out.println("Valor inválido!");
                }
            }while(dep > 0 && dep <= 5000);
        }
}
