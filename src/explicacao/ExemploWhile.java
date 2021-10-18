package explicacao;

import java.util.Scanner;

/**
 *
 * Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 * Depois disso, o programa deve ler as notas de cada um destes alunos, calcular
 * e mostrar na tela a média aritmética destas notas.
 * Utilize o laço WHILE.
 *
 */
public class ExemploWhile {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a quantidade de alunos da turma?");
        int quantidadeAlunos = scanner.nextInt();
        System.out.println();
        int contador = 1;

        while (contador <= quantidadeAlunos){
            System.out.print("Nota 1:");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2:");
            double nota2 = scanner.nextDouble();
            System.out.print("Nota 3:");
            double nota3 = scanner.nextDouble();

            double media = (nota1+nota2+nota3)/3;
            System.out.println("A media do aluno "+contador+" e "+media);
            contador++;
        }
    }
}
