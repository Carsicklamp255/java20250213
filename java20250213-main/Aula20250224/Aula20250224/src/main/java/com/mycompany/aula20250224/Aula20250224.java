package com.mycompany.aula20250224;

import java.util.Scanner;

public class Aula20250224 {

    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibindo o menu
            System.out.printf("=======================================\n");
            System.out.printf("\t\t %s \n", "CALCULADORA");
            System.out.printf("=======================================\n");
            System.out.println("\t[1] Adicao (+)");
            System.out.println("\t[2] Subtracao (-)");
            System.out.println("\t[3] Multiplicacao (*)");
            System.out.println("\t[4] Divisao (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=======================================\n");
            
            System.out.printf("Escolha uma opcao: ");
            opcao = scanner.nextInt(); 
            float n1, n2;
            switch (opcao) {
                case 0:
                    System.out.println("Saindo da calculadora... ");
                    break;
                case 1:
                        System.out.println("Digite o primero numero: ");
                        n1 = scanner.nextFloat(); 
                        System.out.println("Digite o segundo numero: ");
                        n2 = scanner.nextFloat(); 
                        System.out.printf("O resultado foi: %f \n", n1+n2);                     
                    break;
                case 2:
                        System.out.println("Digite o primero numero: ");
                        n1 = scanner.nextFloat(); 
                        System.out.println("Digite o segundo numero: ");
                        n2 = scanner.nextFloat(); 
                        System.out.printf("O resultado foi: %f \n", n1-n2);
                    break;
                case 3:
                        System.out.println("Digite o primero numero: ");
                        n1 = scanner.nextFloat(); 
                        System.out.println("Digite o segundo numero: ");
                        n2 = scanner.nextFloat(); 
                        System.out.printf("O resultado foi: %f \n", n1*n2);
                    break;
                case 4:
                        System.out.println("Digite o primero numero: ");
                        n1 = scanner.nextFloat(); 
                        System.out.println("Digite o segundo numero: ");
                        n2 = scanner.nextFloat(); 
                        
                        if(n2==0){
                            System.out.println("ERRO - Divisao por zero");
                        }else{
                            System.out.printf("O resultado foi: %f \n", n1/n2);
                        }
                    break;
                default:
                    System.out.println("Opcao invalida! Digite um número entre 0 e 4.");
                    break;
            }
        } while (opcao != 0); 

        scanner.close();
    }
}
