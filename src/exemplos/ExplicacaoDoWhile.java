package exemplos;

import java.util.Scanner;

public class ExplicacaoDoWhile {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String repetir;
        int contador = 0;
        do {
            contador++;
            System.out.println("Deseja repetir? (S) - Sim / (N) - Não");
            repetir = scanner.next();
            System.out.println("Repetiu "+contador+" vezes");
        }while(!repetir.equals("N"));

    }
}
