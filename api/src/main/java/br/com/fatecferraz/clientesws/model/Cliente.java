package br.com.fatecferraz.clientesws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@NotBlank
	private String nomeCliente;
	/**
	 * Data de nascimento do cliente
	 */
	@NotBlank
	private String nascCliente;
	
	@NotBlank
	private String emailCliente;
	
	/**
	 * Serve tanto para armazenar o CPF quando
	 * o CNPJ do cliente, dependendo se for
	 * pessoa física ou jurídica
	 */
	@NotBlank
	private String cpfCnpjCliente;
	
	@NotBlank
	private String telefoneCliente;
	
	@NotBlank
	private String enderecoCliente;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNascCliente() {
		return nascCliente;
	}

	public void setNascCliente(String nascCliente) {
		this.nascCliente = nascCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCpfCnpjCliente() {
		return cpfCnpjCliente;
	}

	public void setCpfCnpjCliente(String cpfCnpjCliente) {
		this.cpfCnpjCliente = cpfCnpjCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	
	
}
