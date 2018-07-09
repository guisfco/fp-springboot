package br.com.cadclientes.respository;

import org.springframework.data.repository.CrudRepository;

import br.com.cadclientes.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
