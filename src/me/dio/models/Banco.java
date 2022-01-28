package me.dio.models;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;


public class Banco {
	@Getter private static String nomeBanco = "Banco DIO";
	@Getter private static Map<String, Conta> listaClientes = new HashMap<String, Conta>();

	public static void abrirPoupanca(String nome, String documento, String anoNascimento) {
		Cliente cliente = new Cliente(nome, documento, anoNascimento);
		Conta conta = new ContaPoupanca(cliente);
		String n = "Conta: "+conta.getNumeroConta()+" ";
		listaClientes.put(n, conta);
	}
	public static void abrirCorrente(String nome, String documento, String anoNascimento) {
		Cliente cliente = new Cliente(nome, documento, anoNascimento);
		Conta conta = new ContaCorrente(cliente);
		String n = "Conta:"+conta.getNumeroConta()+" ";
		listaClientes.put(n, conta);
	}
	
	public static Conta getConta(int id) {
		String n = "Conta:"+id+" ";
		return listaClientes.get(n);
	}

}