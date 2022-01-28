package me.dio.models;


public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.tipoConta = "Conta Corrente";
	}
}
