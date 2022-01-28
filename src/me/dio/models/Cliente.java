package me.dio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 @ToString
public class Cliente {
	 @Getter protected long Id;
	@Getter @Setter private String nome;
	@Getter @Setter  private String documento;
	@Getter @Setter private String dataNascimento;
	private static int SEQUENCIA = 1;
	
	Cliente(String nome,String documento, String dataNascimento) {
		this.nome = nome;
		this.documento = documento;
		this.dataNascimento = dataNascimento;
		this.Id = SEQUENCIA++;
	}
}
