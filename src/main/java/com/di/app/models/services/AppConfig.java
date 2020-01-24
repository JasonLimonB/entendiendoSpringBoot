package com.di.app.models.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean("miServicioSimpleBean")
	@Primary
	public IServicio servicio(){
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejoBean")
	public IServicio servicioComplejo(){
		return new MiServicioComplejo();
	}
	
}
