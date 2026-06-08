package service;

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return alunos.isEmpty() ? 0 : soma / alunos.size();
    }

    public Aluno melhorAluno() {
        if (alunos.isEmpty()) return null;
        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNota() > melhor.getNota()) {
                melhor = a;
            }
        }
        return melhor;
    }
}
