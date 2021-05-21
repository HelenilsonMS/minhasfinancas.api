package com.hms.minhasfinancas.service;

import com.hms.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	void validarEmail(String email);

	Usuario salvarUsuario(Usuario usuario);
	

}
