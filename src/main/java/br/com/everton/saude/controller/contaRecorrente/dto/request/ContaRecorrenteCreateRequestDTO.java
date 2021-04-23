package br.com.everton.saude.controller.contaRecorrente.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ContaRecorrenteCreateRequestDTO {

    private String descricao;
    private Integer dia;
    private BigDecimal valor;

}
