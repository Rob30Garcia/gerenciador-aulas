package br.com.alura.curso;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revistando as ArrayList", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
    }
}
