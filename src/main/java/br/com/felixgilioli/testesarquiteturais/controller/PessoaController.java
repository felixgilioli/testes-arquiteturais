package br.com.felixgilioli.testesarquiteturais.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felixgilioli.testesarquiteturais.entity.PessoaEntity;
import br.com.felixgilioli.testesarquiteturais.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<PessoaEntity> findAll() {
        return this.pessoaRepository.findAll();
    }
}
