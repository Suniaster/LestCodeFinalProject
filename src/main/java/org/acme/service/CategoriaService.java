package org.acme.service;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.models.Produto;

import java.text.SimpleDateFormat;

@ApplicationScoped
public class CategoriaService {
    
    public Categoria criarCategoria(Categoria cat) throws Exception {
        return new Categoria();
    }

    public List<Categoria> listarTodasCategorias() throws Exception {
        return new ArrayList<>();
    }

    public Categoria deletarCategoria(int id) throws Exception{
        return new Categoria();
    }

    public Categoria editarCategoria(Categoria cat) throws Exception {
        return new Categoria();
    }
}
