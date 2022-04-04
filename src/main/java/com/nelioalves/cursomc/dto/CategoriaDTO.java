package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import com.nelioalves.cursomc.domain.Categoria;
import javax.validation.constraints.NotEmpty;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatorio")
	private String nome;
	
	public CategoriaDTO () {
		
	}
	
	public CategoriaDTO (Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	
}
