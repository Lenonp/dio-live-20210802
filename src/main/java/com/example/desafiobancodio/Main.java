package com.example.desafiobancodio;

public class Main {
    public static void main(String[] arg) {
        Cliente eliton = new Cliente();
        eliton.setNome("Eliton Prates");

        Conta cc = new ContaCorrente(eliton);
        Conta cp = new ContaPoupanca(eliton);

        cc.depositar(100);
        cc.transferir(75, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
