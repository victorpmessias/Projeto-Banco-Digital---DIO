package me.dio.models;


public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.tipoConta = "Conta Poupanca";
	}
}

