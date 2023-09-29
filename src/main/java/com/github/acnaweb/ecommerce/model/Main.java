package com.github.acnaweb.ecommerce.model;

public class Main {

	public void teste() {
		Cliente cliente = new Cliente();
		
		cliente.setNome("AC");
		cliente.setId(2l);
		cliente.setCep("11111");
		
		String umNome = cliente.getNome();
		
	}

}
