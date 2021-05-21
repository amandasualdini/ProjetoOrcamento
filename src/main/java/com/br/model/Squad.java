package com.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Squad {

    @Id
    private String _id;
    private String Nome;
    private  int QtdPessoas;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        QtdPessoas = qtdPessoas;
    }
}
