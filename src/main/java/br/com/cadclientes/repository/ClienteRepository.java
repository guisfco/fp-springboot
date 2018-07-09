package br.com.cadclientes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.cadclientes.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	List<Cliente> findByNameIgnoreCaseContaining(String name);
}
