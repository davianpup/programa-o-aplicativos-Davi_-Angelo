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
public class ServicoCambio {
    public double vDolar;
    public double cDolar;
    public double saldo;
    public double Sdolar;
    public String[] extrato = new String[100];
    public int qtdMov;
    
        public ServicoCambio(double vDolar,double cDolar,double saldo,double Sdolar,String extrato[],int qtdMov){
            this.vDolar = vDolar;
            this.cDolar = cDolar;
            this.saldo = saldo;
            this.Sdolar = Sdolar;
            this.extrato = new String[100];
            this.qtdMov = qtdMov;
        }
    
        public void Servico(double vDolar,double cDolar,double saldo,double Sdolar,String extrato[],int qtdMov,String rsp2,String rsp,int opc){  
            Scanner input = new Scanner(System.in);
            cDolar = vDolar * 5.32;

            if (cDolar > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                System.out.print("Deseja continuar a operação (s/n)? ");
                rsp2 = input.nextLine();

                if ("S".equalsIgnoreCase(rsp2)) {
                    saldo -= cDolar;
                    Sdolar += vDolar;
                    System.out.println("Compra realizada com sucesso!");
                    System.out.println("Novo saldo em reais: R$" + saldo + "0");
                    System.out.println("Novo saldo em dólar: US$" + Sdolar + "0");

                    extrato[qtdMov] = "COMPRA DÓLAR -R$" + cDolar + "0" + " | +US$" + vDolar + "0";
                    qtdMov++;
                } else {
                    System.out.print("Cancelando...");
                }
            }

            do {
                System.out.print("Digite (R) Simular novamente, (V) para voltar ao Menu ou (E) para encerrar o programa: ");
                rsp = input.nextLine();

                if ("V".equalsIgnoreCase(rsp)) {
                    break;
                } else if ("E".equalsIgnoreCase(rsp)) {
                    opc = 0;
                    break;
                } else if ("R".equalsIgnoreCase(rsp)) {
                } else {
                    System.out.println("Valor inválido");
                }
            } while (true);
         
        }
}
