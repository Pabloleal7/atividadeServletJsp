package br.com.letscode.letscodejavaee.servlet;

import br.com.letscode.letscodejavaee.dao.BancoDeDados;
import br.com.letscode.letscodejavaee.modelo.Pessoa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "cadastro", value = "/cadastro")
public class Cadastro extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {






       /* for (Pessoa pessoa : bd.listar()) {
            writer.println("<ul>");
            writer.println("<li>nome: " + pessoa.getNome() + "</li>");
            writer.println("<li>sobrenome: " + pessoa.getSobrenome() + "</li>");
            writer.println("<li>idade: " + pessoa.getIdade() + "</li>");
            writer.println("<li>data: " + pessoa.getData() + "</li>");
            writer.println("</ul>");
        }*/
    }
}
