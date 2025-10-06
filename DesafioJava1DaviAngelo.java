package com.mycompany.desafio.java1.davi.angelo;
import java.util.Scanner;

public class DesafioJava1DaviAngelo {

    public static void main(String[] args) {
        double saldo=100,dep,vDolar,cDolar,Sdolar=0,vEmp,sBruto,vJ,vP,numAl=0;
        int opc, qtdMov=0,qtdP;
        String rsp,rsp2;
        Scanner input = new Scanner(System.in);
        String[] extrato = new String[100];

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
                    System.out.println("Saldo em reais: R$" + saldo+"0");
                    System.out.println("Saldo em dólar: US$" + Sdolar+"0");
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
                    break;

                case 2:
                   do{ 
                    System.out.print("Valor do depósito (>0 e <=5000): ");
                    dep = input.nextDouble();
                    if(dep > 0 && dep <= 5000){
                        saldo += dep;
                        System.out.println("Depósito realizado com sucesso!");

                        extrato[qtdMov] = "DEPÓSITO +R$"+dep+"0";
                        qtdMov++;
                    }else{
                        System.out.println("Valor inválido!");
                    }
                   }while(dep > 0 && dep <= 5000);
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
                    break;

                case 3:
                    if(qtdMov == 0){
                        System.out.println("Nenhum extrato");
                    }else{
                        System.out.println("Últimas movimentações:");
                        int limite = qtdMov - 10;
                        if(limite < 0) limite = 0;

                        for(int i = qtdMov - 1; i >= limite; i--){
                            System.out.println((qtdMov - i) + ") " + extrato[i]);
                        }
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
                    break;

                case 4:
                    System.out.print("Digite o valor solicitado(mínimo R$ 200,00 e máximo R$100.000,00): ");
                    vEmp = input.nextDouble();

                    System.out.print("Digite seu salário bruto: ");
                    sBruto = input.nextDouble();

                    System.out.print("Escolha a quantidade de parcelas(6,12,18,24,30,36,40,48,56,60,72): ");
                    qtdP = input.nextInt();

                    vJ = ((2.0/100)*vEmp)+vEmp;
                    vP = vJ/qtdP;
                    if(vP <= (30.0/100)*sBruto){
                        numAl = Math.random();
                        long protocolo = (long)(numAl * 1000000);
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
                    break;

                case 5:
                    System.out.println("Saldo disponível em reais: R$" + saldo+"0");
                    System.out.print("Quantos dólares deseja comprar? ");
                    vDolar = input.nextDouble();
                    cDolar = vDolar*5.32;

                    if(cDolar > saldo){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        System.out.print("Deseja concinuar a operação(s/n)? ");
                        rsp2 = input.nextLine();
                        if("S".equalsIgnoreCase(rsp2)==true){
                        saldo -= cDolar;
                        Sdolar += vDolar;
                        System.out.println("Compra realizada com sucesso!");
                        System.out.println("Novo saldo em reais: R$" + saldo+"0");
                        System.out.println("Novo saldo em dólar: US$" + Sdolar+"0");

                        extrato[qtdMov] = "COMPRA DÓLAR -R$"+cDolar+"0"+" | +US$"+vDolar+"0";
                        qtdMov++;
                        }else{
                            System.out.print("Cancelando...");
                        }
                    }
                    do{
                        System.out.print("Digite (R)Simular novamente, (V) para voltar ao Menu ou (E) para encerrar o programa: ");
                        rsp = input.nextLine();
                        if("V".equalsIgnoreCase(rsp)){
                            break;
                        }else if("E".equalsIgnoreCase(rsp)){
                            opc=0;
                            break;
                        }else if("R".equalsIgnoreCase(rsp)){
                            System.out.print("");
                        }else{
                            System.out.println("Valor inválido");
                        }
                    }while(true);
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
 