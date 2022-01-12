package br.dio.banco.digital.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Banco {
    @Getter
    @Setter
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    } */
}
