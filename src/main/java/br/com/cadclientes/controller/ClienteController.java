package br.com.cadclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadclientes.model.Cliente;
import br.com.cadclientes.respository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteRepository.save(cliente),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<>(clienteRepository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<?> findClienteById(@PathVariable("id") long id) {
		return new ResponseEntity<>(clienteRepository.findById(id),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<?> deleteClienteById(@PathVariable("id") long id) {
		clienteRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteRepository.save(cliente),HttpStatus.OK);
	}

}
