package ex01;

import java.util.Scanner;

public class Restaurante {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da conta: ");
        double valorConta = sc.nextDouble();

        double totalConta = valorConta * 1.1;

        System.out.println("Valor total da conta é:" + totalConta);
    }


}
