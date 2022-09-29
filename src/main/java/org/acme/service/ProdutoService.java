package org.acme.service;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.models.Produto;



@ApplicationScoped
public class ProdutoService {
    
    public List<Produto> listarTodosProdutos() {
        return new ArrayList<>();
    }


    public Produto editarProdutoPorId(int id, Produto prod){


        return prod;
    }
}
