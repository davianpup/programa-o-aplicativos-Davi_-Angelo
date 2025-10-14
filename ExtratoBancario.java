/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1.davi.angelo.java;

/**
 *
 * @author Oem
 */
public class ExtratoBancario {
    public int qtdMov;
    public int limite;
    
        public ExtratoBancario(int qtdMov,int limite){
            this.qtdMov = qtdMov;
            this.limite = limite;
        }
        
        public void Extrato(int qtdMov,int limite,String[] extrato){
            if(qtdMov == 0){
                        System.out.println("Nenhum extrato");
                    }else{
                        System.out.println("Últimas movimentações:");
                        limite = qtdMov - 10;
                        if(limite < 0) limite = 0;

                        for(int i = qtdMov - 1; i >= limite; i--){
                            System.out.println((qtdMov - i) + ") " + extrato[i]);
                        }
                    }
        }
}
