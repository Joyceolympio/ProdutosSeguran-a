package com.seguranca.produtosSeguranca.service;

import com.seguranca.produtosSeguranca.model.ProdutosModel;
import com.seguranca.produtosSeguranca.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    ProdutosRepository produtosRepository;

    public List<ProdutosModel> buscarProdutos() {
        return produtosRepository.findAll();
    }

    public ProdutosModel cadastrarProdutos(ProdutosModel produtosModel) {
        return produtosRepository.save(produtosModel);
    }
}
