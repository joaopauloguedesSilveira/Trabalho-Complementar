/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhocomplementar.domain;

import br.com.trabalhocomlementar.util.UtilMessages;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author CPD
 */
@ManagedBean(name = "carrinho")
@SessionScoped
public class Carrinho implements Serializable {

    
    Produto prod;
    List<Produto> carrinho;
    int y = 0;

    public Carrinho() {
    }
    
    public void listar(Produto produto){
        carrinho.add(produto);
    }
    
    public String inserir(){
        prod.setId(y);
        carrinho.add(prod);
        y = y+1;
        return "list.xhtml?faces-redirect=true";
    }
    
    public String novo(){
        prod = new Produto();
        return "new.xhtml?faces-redirect=true";
    }
    
    public String excluir(Produto prod){
        int x;
        
        for( x = 0; x < carrinho.size(); x++){
            if( carrinho.get(x).getId() == prod.getId()){
                carrinho.remove(x);
                UtilMessages.messageInfo("Produto excluído com sucesso!");
            }else{
                UtilMessages.messageError("Falha ao excluir o produto!");
            }
        }
        return "list.xhtml?faces-redirect=true";
    }
    
    public String alterar(){
        int x;
        for( x = 0; x < carrinho.size(); x++){
            if( carrinho.get(x).getId() == prod.getId()){
                carrinho.add(x, prod);
                UtilMessages.messageInfo("Produto Alterado com Sucesso!");
            }else{
                UtilMessages.messageInfo("Falha ao alterar o produto!");
            }
        }
        return "list.xhtml?faces-redirect=true";
    }
     public String cancelar(){
        return "list.xhtml?faces-redirect=true";
    }
    
    public String carregarDados(Produto produto){
        prod = produto;
        return "alter.xhtml?faces-redirect=true";
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }
    
}
