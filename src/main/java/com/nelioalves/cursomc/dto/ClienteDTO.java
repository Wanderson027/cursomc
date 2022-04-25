package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import com.nelioalves.cursomc.domain.Cliente;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private Integer id;
	
	@NotEmpty(message="Preenchimento Obrigatorio!")
	@Length(min=5, max=180, message="O tamanho dever ser no minimo 5 Caracteres e no maximo 80.")
	private String nome;
	
	@NotEmpty(message="O campo email nao pode ser vazio!")
	@Email(message="Email invalido! ")
	private String email;
	
	public ClienteDTO () {}
	public ClienteDTO (Cliente obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
