package com.di.app.models.services;

import org.springframework.stereotype.Component;

@Component
public class Auto implements IAutos{

	@Override
	public String modeloAuto() {
		return "El modelo de este auto es Mazda";
	}

}
