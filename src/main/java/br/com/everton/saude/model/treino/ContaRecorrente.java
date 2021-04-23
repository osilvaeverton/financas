package br.com.everton.saude.model.treino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaRecorrente {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Integer dia;
    private BigDecimal valor;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
}
