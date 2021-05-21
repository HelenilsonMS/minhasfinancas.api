package com.hms.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
