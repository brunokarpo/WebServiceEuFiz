package br.ufg.si.ad.matematica.operacoes;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando servidor... ");
		Endpoint.publish("http://localhost:8081/matematica", new Matematica());
	}

}
