package com.bootcamp.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nData: " + data;
    }

    @Override
    public double calcularXp() {
        return Xp_Padrao + 20d;
    }

}
