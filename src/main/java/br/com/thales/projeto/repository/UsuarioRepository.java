package br.com.thales.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thales.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
