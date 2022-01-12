package br.dio.banco.digital.model;


import br.dio.banco.digital.interfaces.IConta;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract  class Conta implements IConta {
    protected static final  int AGENCIA_PADRAO =1;
    @Getter
    @Setter
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo;
    protected Date dtCriacao;
    protected static  int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.dtCriacao = new Date();
        this.cliente = cliente ;
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected  void imprimeDadosConta() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Titular: %s",this.cliente.nome));
        System.out.println(String.format("Cliente Desde : %s",this.dtCriacao.toString()));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }

   /* public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }*/
}
