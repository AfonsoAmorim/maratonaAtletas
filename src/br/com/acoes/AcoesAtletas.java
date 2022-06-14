package br.com.acoes;

public class AcoesAtletas {

	public int mediaDeTempo = 12;

	public void maratonaA(int distancia, int pesoAtleta, String tipoDeTerreno) {
		System.out.println("A distância a percorrer é: " + distancia);
		System.out.println("O peso do atleta é: " + pesoAtleta);
		System.out.println("A maratona será em: " + tipoDeTerreno);
	}

	public void calcularTempoEstimado(int distancia) { //1km a cada 5 min -> média, 12 km por hora 
		int distanciaMaratona = distancia;
		int mediaDeTempo = 12;
		
		System.out.println("O tempo médio para conclusão do trajeto é: " + distanciaMaratona/mediaDeTempo + " horas"); 
	}

	public void metaProximaSemana(double kmPercorridoHoje) {
		double novaMeta = kmPercorridoHoje;
		double novaMetaSemana = novaMeta*0.3+novaMeta;
		System.out.println("A meta para próxima semana é correr 30% a mais, sendo assim: " + novaMetaSemana + " KM");
	}

	
}


