package br.com.felixgilioli.testesarquiteturais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felixgilioli.testesarquiteturais.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

}
