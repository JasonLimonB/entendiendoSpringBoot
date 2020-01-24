package com.di.app.models.services;

import org.springframework.stereotype.Controller;

@Controller
public class ConsImplementacion implements IConstructorAuto{

	@Override
	public String metodoCtr() {
		return "Estoy usando el constructor para el autowired";
	}

	
	
}
