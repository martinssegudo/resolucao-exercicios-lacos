package explicacao;

import java.util.Scanner;

/**
 *
 * Faça um programa para ler e escrever dados de uma turma de 5 alunos.
 * O programa deve pedir dados como nome, idade e sexo.
 * O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
 *
 */
public class ExemploDoWhile {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String nomeMaisVelho = "",sexoMaisVelho = "";
        int idadeMaisVelho = 0;
        do {
            System.out.println("Digite o nome do aluno");
            String nome = scanner.next();
            System.out.println("Digite a idade do aluno");
            int idade = scanner.nextInt();
            System.out.println("Digite o sexo do aluno");
            String sexo = scanner.next();

            if(idade > idadeMaisVelho){
                nomeMaisVelho = nome;
                sexoMaisVelho = sexo;
                idadeMaisVelho = idade;
            }

            contador++;
        }while (contador < 5);

        System.out.println("Nome do aluno mais velho é "+nomeMaisVelho);
        System.out.println("Idade do aluno mais velho é "+idadeMaisVelho);
        System.out.println("Sexo do aluno mais velho é "+sexoMaisVelho);
    }
}

