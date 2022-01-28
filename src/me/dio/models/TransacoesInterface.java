package me.dio.models;

public interface TransacoesInterface {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void trasferir(double valor, Conta conta);
}
