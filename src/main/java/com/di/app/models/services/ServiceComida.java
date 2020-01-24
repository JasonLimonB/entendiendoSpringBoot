package com.di.app.models.services;

import org.springframework.stereotype.Component;

@Component
public class ServiceComida implements IComida{

	@Override
	public String menuDeldia() {
		return "El menu del dia es: Arroz con mole";
	}

}
