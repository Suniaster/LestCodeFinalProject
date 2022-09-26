package org.acme;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/produto")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@RequestScoped
public class ProdutoResource {

    @GET
    public Response listar() {
        return Response.ok().build();
    }

    @PUT
    public Response editar() {
        return Response.ok().build();
    }

    @DELETE
    public Response deletar() {
        return Response.ok().build();
    }

    @POST
    public Response criar() {
        return Response.ok().build();
    }

    @GET
    @Path("/categoria")
    public Response listarPorCategoria(){
        return Response.ok().build();
    }
}