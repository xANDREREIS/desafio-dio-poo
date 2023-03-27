package com.bootcamp.model;

public abstract class Conteudo {
    protected static final double Xp_Padrao = 10d;

    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo [titulo=" + titulo + ", descricao=" + descricao + "]";
    }

}
