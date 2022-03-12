package com.br.lucia.Veiculos.service.impl;

import com.br.lucia.Veiculos.domain.Carro;
import com.br.lucia.Veiculos.domain.Moto;
import com.br.lucia.Veiculos.service.VeiculoService;

public class VeiculoServiceImpl implements VeiculoService {


    @Override
    public void printCarro() {
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setMarca("Fiat");
        carro.setPlaca("LKU697");
        carro.setCapacidadeCombustivel(1);
        carro.setQuantidadeDeRodas(4);
        System.out.println(carro);
    }


    @Override
    public void printMoto() {
        Moto moto = new Moto();
        moto.setCor("Vermelha");
        moto.setMarca("Honda");
        moto.setPlaca("363HDK");
        moto.setCapacidadeCombustivel(100);
        moto.setQuantidadeDeRodas(2);
        System.out.println(moto);

    }
}
