package br.com.fiap.Main;

import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("Atividade5_LojaProdutos").createEntityManager();
	}
}
