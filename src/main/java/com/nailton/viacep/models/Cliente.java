package com.nailton.viacep.models;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import org.hibernate.collection.spi.PersistentList;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente_tb")
public class Cliente {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Integer id;
	@Column(length = 150, nullable = false)
	private String nome;
	@Column(columnDefinition = "CHAR(14) NOT NULL UNIQUE")
	private String cpf;
	@Column(length = 150, nullable = false, unique = true)
	private String email;
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
    private char sexo;

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("cliente")
	private List<Telefone> telefones;

    
}
