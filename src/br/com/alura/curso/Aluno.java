package br.com.alura.curso;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
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
}
