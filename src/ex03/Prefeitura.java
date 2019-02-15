package ex03;

import java.util.Scanner;

public class Prefeitura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        double salBruto = sc.nextDouble();

        System.out.println("Informe o valor da prestação que pretende pagar: ");
        double valorPrestacao = sc.nextDouble();

        if (valorPrestacao <= (salBruto*0.3)) {
            System.out.println("Empréstimo concedido");
        }else{
            System.out.println("Empréstimo negado");
        }


    }
}
