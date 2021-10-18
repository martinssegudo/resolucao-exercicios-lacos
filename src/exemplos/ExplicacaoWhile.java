package exemplos;

import java.util.Scanner;

public class ExplicacaoWhile {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String repetir;
        int contador = 0;
        System.out.println("Deseja repetir? (S) - Sim / (N) - Não");
        repetir = scanner.next();
        while(!repetir.equals("N")) {
            contador++;
            System.out.println("Repetiu "+contador+" vezes");
            System.out.println("Deseja repetir? (S) - Sim / (N) - Não");
            repetir = scanner.next();
        }
    }
}
