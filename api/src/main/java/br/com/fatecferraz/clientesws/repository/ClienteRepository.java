package br.com.fatecferraz.clientesws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecferraz.clientesws.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	
	
}
