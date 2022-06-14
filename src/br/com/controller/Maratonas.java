package br.com.controller;

import br.com.acoes.AcoesAtletas;

import br.com.entidades.Atletas;

public class Maratonas {

	public static void main(String[] args) {
		Atletas.atletasId("David Goggins", 32, 5599);

		AcoesAtletas.maratonaA(100, 80, "Asfalto");
		AcoesAtletas.calcularTempoEstimado(100);
		AcoesAtletas.metaProximaSemana(100);
		AcoesAtletas.calcularTempoEstimado(100);

	}

}
