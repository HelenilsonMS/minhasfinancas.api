package com.hms.minhasfinancas.service;

import java.util.List;

import com.hms.minhasfinancas.model.entity.Lancamento;
import com.hms.minhasfinancas.model.enums.StatusLancamento;

public interface LancamentoService {
	
	Lancamento savar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar (Lancamento lancamento);
	
	List<Lancamento> buscar (Lancamento lancamentoFiltro);
	
	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);

}
