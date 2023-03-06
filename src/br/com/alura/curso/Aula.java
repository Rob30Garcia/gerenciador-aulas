package br.com.alura.curso;

public class Aula {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getTempo() {
        return this.tempo;
    }

    @Override
    public String toString() {
        return "Aula { " +
                "nome: " + this.titulo +
                ", tempo: " + this.tempo +
                " }";
    }
}
