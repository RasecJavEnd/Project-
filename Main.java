package app;

import model.Aluno;
import service.Turma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            Aluno aluno = new Aluno(nome, nota);
            turma.adicionarAluno(aluno);

            if (nota >= 6) {
                System.out.println("Nota boa! Parabéns, " + nome + ".");
            } else if (nota < 5) {
                System.out.println("Nota ruim. " + nome + " precisa melhorar!");
            } else {
                System.out.println("Nota regular. " + nome + " pode se esforçar mais.");
            }
        }

        System.out.println("\nMédia da turma: " + turma.calcularMedia());

        Aluno melhor = turma.melhorAluno();
        if (melhor != null) {
            System.out.println("Melhor aluno: " + melhor.getNome() + " com nota " + melhor.getNota());
        }

        sc.close();
    }
}
