package br.com.everton.saude.controller.contaRecorrente.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ContaRecorrenteReplaceResponseDTO {

    private Long id;
    private String descricao;
    private Integer dia;
    private BigDecimal valor;

}
