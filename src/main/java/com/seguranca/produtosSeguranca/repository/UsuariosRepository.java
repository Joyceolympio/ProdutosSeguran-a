package com.seguranca.produtosSeguranca.repository;

import com.seguranca.produtosSeguranca.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {

}
