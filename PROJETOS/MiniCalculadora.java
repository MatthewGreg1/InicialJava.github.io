package PROJETOS;

import java.util.Scanner;

public class MiniCalculadora{
  public static void main(String[] args){

    Scanner leitor = new Scanner(System.in);

        System.out.println("___Mini calculadora em Java___\n\n");

        int escolha = 0;
        boolean sair = false;


        while(sair != true){

            System.out.println("Escolha a ação:\n ");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Sair");
            int acao = leitor.nextInt();

            if(acao == 1){

                System.out.printf("\nDigite o primeiro número: ");
                Double num1 = leitor.nextDouble();
                System.out.printf("Digite o segundo número: ");
                Double num2 = leitor.nextDouble();

                System.out.println("\nEscolha uma das ações: ");
                System.out.println("1 - Soma (+)");
                System.out.println("2 - Subtração (-)");
                System.out.println("3 - Multiplicação (*)");
                System.out.println("4 - Divisão (/)");
                escolha = leitor.nextInt();

                switch(escolha){
                    case 1:
                        System.out.printf("A soma dos números é: %.1f%n", soma(num1, num2));
                        break;
                    case 2:
                        System.out.printf("A subtração dos números é: %.1f%n", subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.printf("A multiplicação dos números é: %.1f%n", multiplicacao(num1, num2));
                        break;
                    case 4: 
                        System.out.printf("A divisão dos números é: %.1f%n", divisao(num1, num2));
                        break;
                }
            }else if(acao == 2){
                sair = true;
                System.out.println("Programa finalizado");
            }
         } 
  }

  public static Double soma(Double n1, Double n2){
    Double res = n1 + n2;
    return res;
  }

  public static Double subtracao(Double n1, Double n2){
    Double res = n1 - n2;
    return res;
  }

  public static Double multiplicacao(Double n1, Double n2){
    Double res = n1 * n2;
    return res;
  }

  public static Double divisao(Double n1, Double n2){
    Double res = n1 / n2;
    return res;
  }
}