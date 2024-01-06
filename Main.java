import java.util.ArrayList;
import java.util.Scanner;

/*******************************************************************************
 * 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
 * valores em ordem decrescente.
 *******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Digite o primeiro valor");
     int n1 = sc.nextInt();
     System.out.println("Digite o segundo valor");
     int n2 = sc.nextInt();
     System.out.println("Digite o terceiro valor");
     int n3 = sc.nextInt();
        ArrayList<Integer>Numeros = new ArrayList<Integer>();
        Numeros.add(n1);
        Numeros.add(n2);
        Numeros.add(n3);

    }
}