package br.com.acoes;

public class AcoesAtletas {

	public int mediaDeTempo = 12;

	public void maratonaA(int distancia, int pesoAtleta, String tipoDeTerreno) {
		System.out.println("A dist�ncia a percorrer �: " + distancia);
		System.out.println("O peso do atleta �: " + pesoAtleta);
		System.out.println("A maratona ser� em: " + tipoDeTerreno);
	}

	public void calcularTempoEstimado(int distancia) { //1km a cada 5 min -> m�dia, 12 km por hora 
		int distanciaMaratona = distancia;
		int mediaDeTempo = 12;
		
		System.out.println("O tempo m�dio para conclus�o do trajeto �: " + distanciaMaratona/mediaDeTempo + " horas"); 
	}

	public void metaProximaSemana(double kmPercorridoHoje) {
		double novaMeta = kmPercorridoHoje;
		double novaMetaSemana = novaMeta*0.3+novaMeta;
		System.out.println("A meta para pr�xima semana � correr 30% a mais, sendo assim: " + novaMetaSemana + " KM");
	}

	
}


