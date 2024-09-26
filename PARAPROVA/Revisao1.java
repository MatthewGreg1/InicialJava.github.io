package PARAPROVA;

import java.util.Scanner;

public class Revisao1{
  public static void main(String[]args){
     Scanner leitor = new Scanner(System.in);

     System.out.print("Digite um número: ");
     int num = leitor.nextInt();
     System.out.printf("O número digitado foi: %d%n", num);

    for(int i = 0 ; i <= 3 ; i++){
      System.out.printf("%nCFB Cursos %d", i);
    }

    for( int x = 3 ; x > 0 ; x--){
      System.out.printf("%nCFB Cursos %d", x);
    }

    int control = 0;

    while(control <= 3){
      System.out.println(control);
      control++;
    }
  }
}