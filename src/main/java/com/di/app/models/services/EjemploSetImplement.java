package com.di.app.models.services;

import org.springframework.stereotype.Component;

@Component
public class EjemploSetImplement implements IEjemploSet{

	@Override
	public String datosSet() {
		return "Esto es por medio de un metodo set";
	}

}
