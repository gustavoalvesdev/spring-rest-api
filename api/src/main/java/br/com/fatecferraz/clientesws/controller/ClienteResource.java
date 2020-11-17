package br.com.fatecferraz.clientesws.controller;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecferraz.clientesws.model.Cliente;
import br.com.fatecferraz.clientesws.repository.ClienteRepository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	/**
	 * Injeta a dependência do tipo ClienteRepository automaticamente
	 */
	@Autowired
	private ClienteRepository er;
	
	/**
	 * CORS Policy para permitir o envio e recebimento 
	 * dos dados a partir do localhost do servidor XAMPP
	 */
	@CrossOrigin(origins = "http://localhost", allowedHeaders = {
									"Content-Type", 
									"X-Requested-With", 
									"accept", "Origin", 
									"Access-Control-Request-Method", 
									"Access-Control-Request-Headers"
								}, 
								exposedHeaders = {
										"Access-Control-Allow-Origin", 
										"Access-Control-Allow-Credentials"
								})
	/**
	 * Lista todos os clientes cadastrados no banco de dados
	 */
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable listaClientes() {
		
		Iterable<Cliente> listaClientes = er.findAll();
		return listaClientes;
		
	}
	
	/**
	 * CORS Policy para permitir o envio e recebimento 
	 * dos dados a partir do localhost do servidor XAMPP
	 */
	@CrossOrigin(origins = "http://localhost", allowedHeaders = {
									"Content-Type", 
									"X-Requested-With", 
									"accept", "Origin", 
									"Access-Control-Request-Method", 
									"Access-Control-Request-Headers"
								}, 
								exposedHeaders = {
										"Access-Control-Allow-Origin", 
										"Access-Control-Allow-Credentials"
								})
	/**
	 * Método para cadastro ou atualização dos dados do cliente no banco de dados
	 */
	@PostMapping()
	public Cliente cadastraCliente(@RequestBody @Valid Cliente cliente) {
		return er.save(cliente);
	}
	
	
	/**
	 * CORS Policy para permitir o envio e recebimento 
	 * dos dados a partir do localhost do servidor XAMPP
	 */
	@CrossOrigin(origins = "http://localhost", allowedHeaders = {
									"Content-Type", 
									"X-Requested-With", 
									"accept", "Origin", 
									"Access-Control-Request-Method", 
									"Access-Control-Request-Headers"
								}, 
								exposedHeaders = {
										"Access-Control-Allow-Origin", 
										"Access-Control-Allow-Credentials"
								})
	/**
	 * Exclui um usuário do banco da dados
	 */
	@DeleteMapping()
	public Cliente excluiCliente(@RequestBody Cliente cliente) {
		er.delete(cliente);
		return cliente;
	}
}
