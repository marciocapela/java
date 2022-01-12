package br.dio.banco.digital.interfaces;

import br.dio.banco.digital.model.Conta;

public interface IConta {
    void depositar(double valor) ;

    void sacar(double valor) ;

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
