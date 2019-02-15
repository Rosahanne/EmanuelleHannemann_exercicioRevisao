package ex01;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorConta = sc.nextDouble();
        double totalConta = sc.nextDouble();

        System.out.println("Informe o total da conta: ");

        System.out.println("Total a pagar: " + sc.getTotalConta());




    }


}
