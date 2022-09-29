package org.acme.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.models.Produto;
import org.acme.service.ProdutoService;

@Path("/produto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ProdutoResource {

    @Inject
    ProdutoService service;

    @GET
    public List<Produto> listar() {
        return service.listarTodosProdutos();
    }

    @PUT
    public Response editar(Produto prod) throws Exception  {
        return Response
            .status(Response.Status.CREATED)
            .entity(service.editarProdutoPorId(prod))
            .build()
        ;
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(final @PathParam("id") int id ) {
        return Response.ok().build();
    }

    @POST
    public Response criar(Produto prod) throws Exception {
        return Response.status(Response.Status.CREATED).entity(service.criarProduto(prod)).build();
    }

    @GET
    @Path("/categoria/{categoria_id}")
    public Response listarPorCategoria(final @PathParam("categoria_id") int id){
        return Response.ok().build();
    }
}