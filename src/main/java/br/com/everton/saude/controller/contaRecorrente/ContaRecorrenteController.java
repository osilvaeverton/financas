package br.com.everton.saude.controller.contaRecorrente;

import br.com.everton.saude.controller.contaRecorrente.dto.ContaRecorrenteMapper;
import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteCreateRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteReplaceRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.request.ContaRecorrenteUpdateRequestDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteCreateResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteReplaceResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteResponseDTO;
import br.com.everton.saude.controller.contaRecorrente.dto.response.ContaRecorrenteUpdateResponseDTO;
import br.com.everton.saude.model.treino.ContaRecorrente;
import br.com.everton.saude.repository.ContaRecorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/contas-recorrentes")
@RestController
public class ContaRecorrenteController {

    @Autowired
    ContaRecorrenteRepository contaRecorrenteRepository;

    @Autowired
    ContaRecorrenteMapper mapper;

    @GetMapping
    public List<ContaRecorrenteResponseDTO> list(){
        return this.contaRecorrenteRepository.findAll().stream()
                .map(mapper::toContaRecorrenteRespondeDTO)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public ContaRecorrenteResponseDTO findById(@PathVariable Long id){
        return this.contaRecorrenteRepository.findById(id)
                .map(mapper::toContaRecorrenteRespondeDTO)
                .orElse(null);
    }

    @PostMapping
    public ContaRecorrenteCreateResponseDTO create(@RequestBody ContaRecorrenteCreateRequestDTO contaRecorrenteCreateRequestDTO){
        ContaRecorrente contaRecorrente = this.contaRecorrenteRepository.save(mapper.toContaRecorrente(contaRecorrenteCreateRequestDTO));
        return mapper.toContaRecorrenteCreateResponseDTO(contaRecorrente);
    }

    @PutMapping(path = "/{id}")
    public ContaRecorrenteReplaceResponseDTO replace(@PathVariable Long id, @RequestBody ContaRecorrenteReplaceRequestDTO contaRecorrenteReplaceRequestDTO){
        Optional<ContaRecorrente> optionalContaRecorrente = this.contaRecorrenteRepository.findById(id);

        if(optionalContaRecorrente.isPresent()){
            ContaRecorrente contaRecorrente = mapper.toContaRecorrente(contaRecorrenteReplaceRequestDTO);
            return mapper.toContaRecorrenteReplaceResponseDTO(this.contaRecorrenteRepository.save(contaRecorrente));
        } else {
            return null;
        }
    }

    @PatchMapping(path = "/{id}")
    public ContaRecorrenteUpdateResponseDTO update(@PathVariable Long id, @RequestBody ContaRecorrenteUpdateRequestDTO contaRecorrenteUpdateRequestDTO){
        Optional<ContaRecorrente> optionalContaRecorrente = this.contaRecorrenteRepository.findById(id);

        if(optionalContaRecorrente.isPresent()){
            ContaRecorrente contaRecorrente = mapper.toContaRecorrente(contaRecorrenteUpdateRequestDTO);
            return mapper.toContaRecorrenteUpdateRequestDTO(contaRecorrente);
        } else
            return null;

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        this.contaRecorrenteRepository.deleteById(id);
    }
}
