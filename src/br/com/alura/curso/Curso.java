package br.com.alura.curso;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return String.format("{ curso: %s, tempo total: %d, aulas: ", this.titulo, this.getTempoTotal())
                + this.aulas + "}";
    }
}
