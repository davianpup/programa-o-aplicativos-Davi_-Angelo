/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio1.davi.angelo.java;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Oem
 */
public class Desafio12DaviAngeloJava {

    public static void main(String[] args) {
        double saldo=100,dep=0,vDolar,cDolar=0,Sdolar=0,vEmp,sBruto,vJ=0,vP=0,numAl=0,protocolo=0;
        int opc=0, qtdMov=0,qtdP,limite=0;
        String rsp="",rsp2="";
        Scanner input = new Scanner(System.in);
        String[] extrato = new String[100];
        DinamicaEncerramento Encerramento2 = new DinamicaEncerramento(rsp,opc);

        do {
            System.out.println("=== Caixa Rápido ===");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Extrato");
            System.out.println("4 - Simular Emprestimo");
            System.out.println("5 - Comprar Dólar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch(opc){
                case 1:
                    SaldoBancario Saldo2 = new SaldoBancario(saldo,Sdolar);
                    Saldo2.Saldo(saldo, Sdolar);
                    
                    
                    Encerramento2.Encerramento(rsp, opc);
                    break;

                case 2:
                    DepositoBancario Deposito2 = new DepositoBancario(dep,saldo);
                    Deposito2.Deposito(dep, saldo, extrato, qtdMov);
                    
                    Encerramento2.Encerramento(rsp, opc);
                    break;

                case 3:
                    ExtratoBancario Extrato2 =new ExtratoBancario(qtdMov,limite);
                    Extrato2.Extrato(qtdMov, limite, extrato);
                    
                    Encerramento2.Encerramento(rsp, opc);
                    break;

                case 4:
                    System.out.print("Digite o valor solicitado(mínimo R$ 200,00 e máximo R$100.000,00): ");
                    vEmp = input.nextDouble();

                    System.out.print("Digite seu salário bruto: ");
                    sBruto = input.nextDouble();

                    System.out.print("Escolha a quantidade de parcelas(6,12,18,24,30,36,40,48,56,60,72): ");
                    qtdP = input.nextInt();

                   SimuladorEmprestimo Emprestimo2 = new SimuladorEmprestimo(vEmp,sBruto,qtdP);
                   Emprestimo2.Emprestimo(vEmp, sBruto, qtdP, vJ, vP, numAl, protocolo, rsp, opc);
                   
                   Encerramento2.Encerramento(rsp, opc);
                   break;
                   

                case 5:
                    System.out.println("Saldo disponível em reais: R$" + saldo + "0");
                    System.out.print("Quantos dólares deseja comprar? ");
                    vDolar = input.nextDouble();
                    ServicoCambio Servico2 = new ServicoCambio(vDolar,cDolar,saldo,Sdolar,extrato,qtdMov);
                    Servico2.Servico(vDolar, cDolar, saldo, Sdolar, extrato, qtdMov, rsp2, rsp, opc);
                    
                    Encerramento2.Encerramento(rsp, opc);
                    break;
                case 0:
                    System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa Rápido.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(opc!=0);
    
    }
}
