package explicacao;


import java.util.Scanner;

/**
 *
 * Faça um programa que leia um número natural N e calcule a soma abaixo
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
 * Utilize o laço for.
 *
 * 𝑆𝑆 =1−1/2+1/3-1/4+1/5. . . (+ ou -)1/N
 *
 */
public class ExemploFor {
    /**
     *
     * 1 - Ler um numero do teclado
     * premisa: somador começa de 1
     * 2 - Repetir enquanto <= numero e começa de 2
     *  2.1 - Se par subtrai 1/iteracaoAtual ao numero atual
     *  2.2 - Se impar soma 1/iteracaoAtual ao numero atual
     */

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        float DIVIDENDO = 1;
        System.out.print("Quantidade de vezes qeu deseja repetir o calculo: ");
        int totalRepeticoes = scanner.nextInt();
        System.out.println();
        float somador = 1;
        for (float iteracaoAtual = 2; iteracaoAtual <= totalRepeticoes; iteracaoAtual++) {
            if(iteracaoAtual%2 == 0) {
                System.out.println("-"+1+"/"+iteracaoAtual);
                somador = somador - (DIVIDENDO/iteracaoAtual);
            }else {
                System.out.println("+"+1+"/"+iteracaoAtual);
                somador = somador + (DIVIDENDO/iteracaoAtual);
            }
        }

        System.out.println("Resultado de "+totalRepeticoes+" repetições do cálculo é: "+somador);

    }
}
