package ex04;

import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numero = sc.nextInt();

        if (numero >=0 && numero <=100) {
            System.out.println("Número pertence ao intervalo");
        }else{
            System.out.println("Número não pertence ao interval");
        }


    }
}
