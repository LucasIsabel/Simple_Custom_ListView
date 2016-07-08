package com.example.lucas.customlistview;

/**
 * Created by lucas on 08/07/16.
 */
public class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa(String nome,String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

}
