public class Metodos{
  public static void main(String[] args){

    int r;

    msg("CFB Cursos", 3);
    System.out.println(soma(10, 20));
    System.out.println(soma2(1,2,3));
    System.out.println(soma2(2.5,2.5));
  }

  public static void msg(String m, int l){
    for(int i=0 ; i<l ; i++){
      System.out.println(m);
    }
  }

  public static int soma(int n1, int n2){
    int res = n1 + n2;
    return res;

  }

  public static int soma2(int... numeros){ // Para somar quantos números quiser
    int res=0;
    for(int n:numeros){ // n: - É sintaxe para relação com arrays
        res+=n; // Mais igual
    }
    return res;
  }

  // Sobrecarga de metódo.
  public static Double soma2(Double... numeros){
    Double res=0.0;
    for(Double n:numeros){
        res+=n;
    }
    return res;
  } 
}
