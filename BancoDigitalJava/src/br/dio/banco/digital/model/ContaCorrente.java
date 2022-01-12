package br.dio.banco.digital.model;

public class ContaCorrente extends Conta{
    private static  int SEQUENCIAL = 1;

    public  ContaCorrente( Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimeDadosConta();
    }
}
