package com.seguranca.produtosSeguranca.controller;

import com.seguranca.produtosSeguranca.model.ProdutosModel;
import com.seguranca.produtosSeguranca.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutosController {

    @Autowired
    ProdutosService produtosService;

    @GetMapping(value = "/produtos")
    public ResponseEntity<List<ProdutosModel>> buscar(){
        return ResponseEntity.ok(produtosService.buscarProdutos());
    }

    @PostMapping(value = "/produtos/create")
    public ResponseEntity<ProdutosModel> cadastrar(@RequestBody ProdutosModel produtosModel){
        ProdutosModel produtoNovo = produtosService.cadastrarProdutos(produtosModel);
        return new ResponseEntity<>(produtoNovo, HttpStatus.CREATED);
    }
}
