package br.com.everton.saude.controller.contaRecorrente.dto;

import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteCreateRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteReplaceRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteUpdateRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteCreateResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteReplaceResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteUpdateResponseDTO;
import br.com.everton.saude.model.treino.ContaRecorrente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContaRecorrenteMapper {

    ContaRecorrente toContaRecorrente(ContaRecorrenteCreateRequestDTO treinoCreateRequestDTO);
    ContaRecorrente toContaRecorrente(ContaRecorrenteReplaceRequestDTO treinoReplaceRequestDTO);
    ContaRecorrente toContaRecorrente(ContaRecorrenteUpdateRequestDTO treinoUpdateRequestDTO);

    ContaRecorrenteResponseDTO toContaRecorrenteRespondeDTO(ContaRecorrente treino);
    ContaRecorrenteCreateResponseDTO toContaRecorrenteCreateResponseDTO(ContaRecorrente treino);
    ContaRecorrenteReplaceResponseDTO toContaRecorrenteReplaceResponseDTO(ContaRecorrente treino);
    ContaRecorrenteUpdateResponseDTO toContaRecorrenteUpdateRequestDTO(ContaRecorrente treino);

}
