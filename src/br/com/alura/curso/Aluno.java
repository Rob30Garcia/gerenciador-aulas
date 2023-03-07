package br.com.alura.curso;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }

        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }

    @Override
    public String toString() {
        return String.format("{ Aluno: %s, matricula: %d }", this.nome, this.numeroMatricula);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;

        return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
