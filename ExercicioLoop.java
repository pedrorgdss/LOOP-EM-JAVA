/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicioloop;

/**
 *
 * @author Pedro
 */
//importar o random e o java scanner
import java.util.Scanner;
import java.util.Random;

public class ExercicioLoop {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        Random Variavel = new Random();

        int numSecreto = Variavel.nextInt(1, 11);
        int Tentativa = 0;
        int Contador = 0;

        System.out.println("Jogo do número secreto!");
        System.out.println("Adivinhe o número de 1 a 10");
        try {
            do {
                System.out.print("Insira seu palpite: ");

                Tentativa = inUser.nextInt();
                Contador++;

                if (Tentativa < numSecreto) {
                    System.out.println("O NÚMERO SECRETO É MAIOR!");
                } else if (Tentativa > numSecreto) {
                    System.out.println("O NÚMERO SECRETO É MENOR!");
                } else {
                    System.out.println("Meus Parabéns, você ACERTOU!!");
                    if (Contador == 1) {
                        System.out.println("VOCÊ ACERTOU DE PRIMEIRA!");
                    } else {
                        System.out.println("VOCÊ ACERTOU EM " + Contador + " TENTATIVAS!");
                    }
                }

            } while (Tentativa != numSecreto);
        } catch (Exception e) {
            System.out.println("ERRO: Você deve inserir apenas números inteiros!");
        } finally {
            inUser.close();
            System.out.println("FIM DO PROGRAMA, OBRIGADO POR JOGAR");
        }

    }
}
