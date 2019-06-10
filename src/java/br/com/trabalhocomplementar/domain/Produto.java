/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhocomplementar.domain;

/**
 *
 * @author CPD
 */
public class Produto {
    private int id;
    private String Nome;
    private float preco;
    private String desc;
    
    public Produto(){
    }

    public Produto(int id, String Nome, float preco, String desc) {
        this.id = id;
        this.Nome = Nome;
        this.preco = preco;
        this.desc = desc;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
