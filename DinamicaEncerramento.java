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
public class DinamicaEncerramento {
    public String rsp;
    public int opc;
    
    public DinamicaEncerramento(String rsp,int opc){
        this.rsp = rsp;
        this.opc = opc;
    }
    
    public void Encerramento(String rsp,int opc){
        Scanner input = new Scanner(System.in);
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
