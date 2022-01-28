package me.dio;

import me.dio.models.Conta;
import me.dio.models.Banco;
import java.util.List;

public class Main {
	public static List<Conta> contas;
	
	public static void main(String[] args) {
		System.out.println(Banco.getNomeBanco());
		Banco.abrirCorrente("Victor", "999.999.999-99", "14-01-1999");

		Banco.abrirCorrente("Carlos", "999.999.999-99", "14-01-1999");
		Banco.abrirPoupanca("Pedro", "999.999.999-99", "14-01-1999");
		System.out.println(Banco.getListaClientes());
		Conta minhaConta = Banco.getConta(1);
		
		System.out.println(minhaConta);
		minhaConta.imprimirExtrato();
		minhaConta.depositar(200);
		minhaConta.imprimirExtrato();
		minhaConta.trasferir(100, Banco.getConta(2));
		minhaConta.imprimirExtrato();
		Banco.getConta(2).imprimirExtrato();
	}
}
