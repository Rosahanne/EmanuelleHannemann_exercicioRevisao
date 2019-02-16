package ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();


        double CONSTANTE = 3.141559;



        double volume = CONSTANTE * (raio * raio) * altura;

        System.out.println("O valor do volume é:" + volume);
    }
}
