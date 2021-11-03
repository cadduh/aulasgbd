package br.com.aulasgbd.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.aulasgbd.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {

}
