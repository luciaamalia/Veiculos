package com.br.lucia.Veiculos.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Veiculo {
    private String placa;
    private String cor;
    private String marca;
    private Integer capacidadeCombustivel;
    private Integer quantidadeDeRodas;


}
