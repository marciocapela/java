package br.dio.banco.digital;

import br.dio.banco.digital.model.Cliente;
import br.dio.banco.digital.model.Conta;
import br.dio.banco.digital.model.ContaCorrente;
import br.dio.banco.digital.model.ContaPoupanca;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente1=  new Cliente("Carlos Eduardo","01/12/1970");
        Conta cc = new ContaCorrente(new Cliente("Carlos Eduardo","01/12/1970"));
        Conta poupanca = new ContaPoupanca(new Cliente("Adriana Eduarda","01/11/2015"));

        poupanca.imprimirExtrato();
        poupanca.depositar(1000);
        System.out.println("***** POUPANCA Deposito 1000 Realizado *****");
        poupanca.sacar(100);
        System.out.println("***** POUPANCA Sacar 100 Realizado *****");
        poupanca.imprimirExtrato();

        cc.depositar(5000);
        System.out.println("***** CC Deposito 5000 Realizado *****");
        cc.transferir(1000,poupanca);
        System.out.println("***** CC Transferencia 1000 Realizado *****");
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();



    }
}
