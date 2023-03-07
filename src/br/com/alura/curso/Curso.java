package br.com.alura.curso;

import java.util.*;

public class Curso {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaPorAluno = new HashMap<>();

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

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);

        this.matriculaPorAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return this.matriculaPorAluno.get(numero);
    }

    @Override
    public String toString() {
        return String.format("{ curso: %s, tempo total: %d, aulas: ", this.titulo, this.getTempoTotal())
                + this.aulas + "}";
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }
}
