package br.com.entidades;

public class Atletas {

	private String nome;
	private int idade;
	private int rA; // registro do atleta

	public static void atletasId(String nome, int idade, int rA) {
		System.out.println("O nome do atleta é: " + nome);
		System.out.println("A idade do atleta é: " + idade + " anos");
		System.out.println("O registro do atleta é: " + rA);
	}
	
	public Atletas() {
	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getrA() {
		return rA;
	}

	public void setrA(int rA) {
		this.rA = rA;
	}

}
