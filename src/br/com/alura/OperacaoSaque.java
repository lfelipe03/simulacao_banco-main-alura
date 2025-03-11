package br.com.alura;

import java.math.BigDecimal;

<<<<<<< HEAD
public class OperacaoSaque {
=======
public class OperacaoSaque implements Runnable {
>>>>>>> 9b095ac (Criando classe AppBanco)

    private Conta conta;
    private BigDecimal valor;

    public OperacaoSaque(Conta conta, BigDecimal valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public void executa() {
        System.out.println("Iniciando operação de saque.");
        var saldoAtual = conta.getSaldo();

        if (saldoAtual.compareTo(valor) >= 0) {
            System.out.println("Debitando valor da conta");
            conta.debitaSaldo(valor);
            System.out.println("Saldo atual: " +conta.getSaldo());
        }
        System.out.println("Finalizando operação de saque.");
    }
<<<<<<< HEAD
=======

    @Override
    public void run() {
        executa();
        System.out.println(Thread.currentThread().getName());

    }
>>>>>>> 9b095ac (Criando classe AppBanco)
}
