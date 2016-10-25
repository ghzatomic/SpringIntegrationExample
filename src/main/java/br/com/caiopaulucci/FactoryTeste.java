package br.com.caiopaulucci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryTeste {

	@Bean(name="gritador")
	public Gritador gritador(){
		return new Gritador();
	}
	
	
}
