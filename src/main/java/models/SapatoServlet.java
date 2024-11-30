package com.fiec.revisaofinal;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sapatos")
public class SapatoServlet extends HttpServlet {

    //private SapatoRepositorio sapatoRepositorio;

    public SapatoServlet() {
        // inicialize o repositorio com o entitymanager aqui
    }

    // Create  /sapatos
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*String nome = request.getParameter("nome");
        String preco = request.getParameter("preco");
        String imagem = request.getParameter("imagem");
        Sapato s = Sapato.builder()
                .nome(nome)
                .preco(Double.valueOf(preco))
                .imagemUrl(imagem)
                .build();
         */

        response.setContentType("text/html");
        response.getWriter().println("Sapato Salvo");
    }

    // Read  /sapatos
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        //response.getWriter().println(sapatos.stream().map(Sapato::toString).collect(Collectors.toList()));

    }

    // Update   /sapatos/:id
    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = getId(request);

        response.setContentType("text/html");
        response.getWriter().println("Sapato Atualizado");
    }

    // Delete  /sapatos/:id
    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = getId(request);

        response.setContentType("text/html");
        response.getWriter().println("Sapato Deletado");
    }

    private static String getId(HttpServletRequest req) {
        String path = req.getPathInfo();
        String[] paths = path.split("/");
        String id = paths[paths.length - 1];
        return id;
    }
}
