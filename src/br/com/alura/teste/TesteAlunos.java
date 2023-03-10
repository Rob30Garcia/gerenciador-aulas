package br.com.alura.teste;

import br.com.alura.curso.Aluno;
import br.com.alura.curso.Aula;
import br.com.alura.curso.Curso;

public class TesteAlunos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println(turini.equals(a1));
        System.out.println(javaColecoes.estaMatriculado(turini));

        //Aluno testandoAluno = new Aluno(null, 47967);

        Aluno matriculadoEncontrado = javaColecoes.buscaMatriculado(5617);
        System.out.println(matriculadoEncontrado);

    }
}
