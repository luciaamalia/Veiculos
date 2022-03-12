package com.br.lucia.Veiculos;

import com.br.lucia.Veiculos.service.impl.VeiculoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
		VeiculoServiceImpl veiculoService = new VeiculoServiceImpl();
		veiculoService.printCarro();
		veiculoService.printMoto();
	}

}
