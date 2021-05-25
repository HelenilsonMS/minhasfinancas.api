package com.hms.minhasfinancas.service;

import java.util.Optional;

import com.hms.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	void validarEmail(String email);

	Usuario salvarUsuario(Usuario usuario);
	
	Optional<Usuario> obtUsuario(Long id);

}

