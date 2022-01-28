package me.dio.models;

import lombok.Getter;
import lombok.ToString;


public abstract class Conta implements TransacoesInterface{
	private final int AGENCIA = 1111;
	private static int SEQUENCIA_NUMERO_CONTA = 1;
	@Getter protected String tipoConta;
	@Getter protected Cliente cliente;
	@Getter protected int numeroConta;
	@Getter protected int agencia;
	@Getter protected double saldo;
	
	Conta(Cliente cliente) {
		this.agencia = AGENCIA;
		this.numeroConta = SEQUENCIA_NUMERO_CONTA++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void trasferir(double valor, Conta conta) {
		this.saldo -= valor;
		conta.saldo += valor;
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato: "+ this.getTipoConta());
		System.out.println("-----------------------------------");
		System.out.println("Titular: "+ this.getCliente().getNome());
		System.out.println("Agencia: "+ this.getAgencia());
		System.out.println("Conta: "+ this.getNumeroConta());
		System.out.println("Saldo: "+ this.getSaldo());
		
	}

	@Override
	public String toString() {
		return " Dados: {Tipo de conta="+tipoConta + ": cliente=" +"ID:" +cliente.getId() + "; Nome:" +cliente.getNome() + ", agencia="
				+ agencia + "]}";
	}

}
