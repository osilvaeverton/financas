package br.com.everton.saude.controller.contaRecorrente.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Data
public class ContaRecorrenteResponseDTO {

    private Long id;
    private String descricao;
    private Integer dia;
    private BigDecimal valor;

}
