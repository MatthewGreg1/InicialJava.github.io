import java.util.Scanner;

public class ComandosLoop{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        //FOR -> Usado quando SOUBER de antemão quantas vezes o comando precisará será executado

        System.out.printf("%n ----------- Início do programa [FOR] -----------");

        for(int cont=0 ; cont <= 5 ; cont++){
            System.out.printf("%nNúmero %d", cont);
        }
        
        for(int cont2=5 ; cont2 >=0 ; cont2--){
            System.out.printf("%n%d oremùN", cont2);
        }

        System.out.printf("%n ----------- Fim do programa [FOR] -----------");
        


        //While -> Usado quando NÃO souber quantas vezes o comando precisará ser executado
        //Testa a condição primeiro, e depois executa

        System.out.printf("%n%n%n ----------- Início do programa [WHILE] -----------%n");

        System.out.print("Digite quantas vezes será executado: ");
        int max = scan.nextInt(); // Forma de input sem precisar declarar variável antes 

        int cont3=0;
        while(cont3 <= max){
            System.out.println(cont3 + " - CFB Cursos");
            cont3++; //Pode ser declarado antes ou depois
        }

        System.out.printf("----------- Fim do programa [WHILE] -----------");



        //DO WHILE -> Usado quando precisamos rodar pelo menos UMA vez o comando
        //Começa executanto e só depois testa a condição

        System.out.printf("%n%n%n ----------- Início do programa [DO WHILE] -----------%n");
        int cont4 = 0;
        do{
            System.out.printf("CFB Cursos %d", cont4);
            cont4++;
        }while(cont4 <= 0);

        System.out.printf("%n----------- Fim do programa [DO WHILE] -----------");
    }
}


        


