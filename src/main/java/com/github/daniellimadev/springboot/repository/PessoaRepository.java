package com.github.daniellimadev.springboot.repository;

import com.github.daniellimadev.springboot.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
