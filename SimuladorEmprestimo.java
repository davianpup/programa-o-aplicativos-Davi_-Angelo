/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1.davi.angelo.java;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Oem
 */
public class SimuladorEmprestimo {
    public double vEmp;
    public double sBruto;
    public int qtdP;
    
        public SimuladorEmprestimo(double vEmp,double sBruto,int qtdP){
            this.vEmp = vEmp;
            this.sBruto = sBruto;
            this.qtdP = qtdP;
        }
        
        public void Emprestimo(double vEmp,double sBruto,int qtdP,double vJ,double vP,double numAl,double protocolo,String rsp,int opc){
                    Scanner input = new Scanner(System.in);
                    vJ = ((2.0/100)*vEmp)+vEmp;
                    vP = vJ/qtdP;
                    if(vP <= (30.0/100)*sBruto){
                        numAl = Math.random();
                        protocolo = (double)(numAl * 1000000);
                        System.out.println("Empréstimo disponível, entre em contato com a central e informe o número de protocolo EM"+protocolo);
                        System.out.println("Valor da parcela: R$"+vP+"0");
                        System.out.println("Valor solicitado: R$"+vEmp+"0");
                        System.out.println("Valor com Juros: R$"+vJ+"0");
                    }else{
                        System.out.println("Valor indisponível. O valor da parcela ultrapassa o limite permitido!");
                    }
                    do{
                        System.out.print("Digite V para voltar ao Menu ou (E) para encerrar o programa: ");
                        rsp = input.nextLine();
                        if("V".equalsIgnoreCase(rsp)){
                            break;
                        }else if("E".equalsIgnoreCase(rsp)){
                            opc=0;
                            break;
                        }else{
                            System.out.println("Valor inválido");
                        }
                    }while(true);
        }
}
