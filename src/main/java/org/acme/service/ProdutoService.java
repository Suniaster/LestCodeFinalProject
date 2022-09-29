package org.acme.service;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.models.Produto;

import java.text.SimpleDateFormat;

@ApplicationScoped
public class ProdutoService {
    
    public List<Produto> listarTodosProdutos() {
        return new ArrayList<>();
    }


    public Produto editarProdutoPorId(Produto prod) throws Exception {
        validaProduto(prod);
        return prod;
    }

    public Produto criarProduto(Produto prod) throws Exception{
        validaProduto(prod);
        return prod;
    }



    private void validaProduto(Produto prod) throws Exception {
        var data = prod.getDataCriacao() == null ? "" : prod.getDataCriacao();
        if(data.isBlank()){
            throw new Exception();
        }
        new SimpleDateFormat("yyyy-MM-dd").parse(data);

        if(prod.getNome().isBlank()){
            throw new Exception();
        }

        if(prod.getQuantidadeEstoque() < 0){
            throw new Exception();
        }
    }
}
