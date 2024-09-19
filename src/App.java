import java.util.Scanner;
import java.util.Random;

public class App{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Random sorteio = new Random();
        int J1;
        int PC;

        PC = sorteio.nextInt(100);

        do{
          System.out.println("Insira um numero de 0 a 10");
          J1 = teclado.nextInt();

          if (J1 < PC) {
            System.out.println("Palpite menor!");
        } else if (J1 > PC) {
            System.out.println("Palpite maior!");
        } else {
            System.out.println("Acertou!");
        }    

        }while(J1 != PC);
  
    teclado.close();
    }
}