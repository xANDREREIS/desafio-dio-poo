package com.bootcamp.model;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nCarga horaria: " + cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return Xp_Padrao * cargaHoraria;
    }

   
}
