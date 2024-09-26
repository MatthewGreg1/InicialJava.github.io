public class ComandosDecisao{
    public static void main(String[] args){
        
        //IF e IF...ELSE    

        int nota = 85;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60; 

        System.out.println("Primeiro programa (if e else): ");

        // && = and   // !- = Diferente
        if((nota >= media) && (faltas <= maxFaltas)){         
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");

        }

        //Tabela verdade AND &&
        /*
            V V = V
            V F = F
            F V = F
            F F = F

         */
          //Tabela verdade OR ||
        /*
            V V = V
            V F = V
            F V = V
            F F = F

         */

        //SWITCH
         
        int pos = 1;

        System.out.println("\nSegundo programa (switch): ");

        switch(pos){
            case 1: 
                System.out.println("Primeiro corredor");
                break;
            case 2:
                System.out.println("Segundo corredor");
                break;
            case 3:
                System.out.println("Terceiro corredor");
                break;
            case 4: case 5: case 6:
                System.out.println("Corredor interditado");
                break;
            default: 
                System.out.println("Corredor não encontrado");
                break;
        }
      }
}
