package br.com.everton.saude.repository;

import br.com.everton.saude.model.treino.ContaRecorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRecorrenteRepository extends JpaRepository<ContaRecorrente, Long> {
}
