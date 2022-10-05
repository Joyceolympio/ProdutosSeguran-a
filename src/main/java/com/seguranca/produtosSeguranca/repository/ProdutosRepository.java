package com.seguranca.produtosSeguranca.repository;

import com.seguranca.produtosSeguranca.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
}
