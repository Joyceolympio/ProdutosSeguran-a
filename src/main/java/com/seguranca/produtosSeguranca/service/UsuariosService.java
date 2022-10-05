package com.seguranca.produtosSeguranca.service;


import com.seguranca.produtosSeguranca.model.UsuariosModel;
import com.seguranca.produtosSeguranca.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    //Criptografando a minha senha
    //Dentro dessa classe a gente tem um método que utiliza o salt para criptografrar a senha
    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public List<UsuariosModel> buscarUsuarios() {
        return usuariosRepository.findAll();
    }

    public UsuariosModel cadastrarUsuarios(UsuariosModel usuariosModel) {

        //sobreesve a senha, você pega a senha e passa a senha dentro da criptografia.
        usuariosModel.setSenha(passwordEncoder().encode(usuariosModel.getSenha()));

        return usuariosRepository.save(usuariosModel);
    }
}
