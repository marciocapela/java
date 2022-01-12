package br.dio.banco.digital.model;

import lombok.Getter;
import lombok.Setter;

public class Cliente {
    @Getter
    @Setter
    String nome;
    String dtNascimento;


    public Cliente(String nome, String dtNascimento){
        this.nome=nome;
        this.dtNascimento=dtNascimento;
    }

}
