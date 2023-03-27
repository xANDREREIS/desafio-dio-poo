package com.bootcamp;

import java.time.LocalDate;


import com.bootcamp.model.Bootcamp;
import com.bootcamp.model.Curso;
import com.bootcamp.model.Dev;
import com.bootcamp.model.Mentoria;

public class Main {
    public static void main(String[] args) {

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Retira duvidas JAVA");
        mentoria.setDescricao("Mentoria ao vivo as 20h");
        mentoria.setData(LocalDate.of(2023, 3, 25));

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Bootcamp Java Banco Pan");
        curso.setCargaHoraria(114);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Bootcamp Javascript Banco Pan");
        curso2.setCargaHoraria(92);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA");
        bootcamp.setDescricao("Bootcamp JAVA voltado mercado de trabalho");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos de Andre: " + devAndre.getConteudosInscritos());
        System.out.println("--------------------------");

        devAndre.progredir();
        System.out.println("Conteudos incritos de Andre: " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Andre: " + devAndre.getConteudosConcluidos());
        System.out.println("Xp: " + devAndre.calcularTotalXp());
        System.out.println("--------------------------");

        devAndre.progredir();
        System.out.println("Conteudos incritos de Andre: " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Andre: " + devAndre.getConteudosConcluidos());
        System.out.println("Xp: " + devAndre.calcularTotalXp());
        System.out.println("--------------------------");

        devAndre.progredir();
        System.out.println("Conteudos incritos de Andre: " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Andre: " + devAndre.getConteudosConcluidos());
        System.out.println("Xp: " + devAndre.calcularTotalXp());
    }
}
