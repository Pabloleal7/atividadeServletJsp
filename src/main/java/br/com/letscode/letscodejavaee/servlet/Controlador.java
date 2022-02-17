package br.com.letscode.letscodejavaee.servlet;

import br.com.letscode.letscodejavaee.dao.BancoDeDados;
import br.com.letscode.letscodejavaee.modelo.Pessoa;
import br.com.letscode.letscodejavaee.modelo.acao.CadastrarPessoas;
import br.com.letscode.letscodejavaee.modelo.acao.CadastrarPessoasForm;
import br.com.letscode.letscodejavaee.modelo.acao.ListarPessoas;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String acao = req.getParameter("acao");
        String path = null;

        switch (acao) {
            case "cadastrar-pessoas":
                CadastrarPessoas cadastrarPessoas = new CadastrarPessoas(req, res);
                path = cadastrarPessoas.executar();
                System.out.println(path);


                break;
            case "listar-pessoas":

                ListarPessoas listarPessoas = new ListarPessoas(req, res);
                path = listarPessoas.executar();
                System.out.println(path);

                break;
            case "remover-pessoas":

                //inplementar

                break;
            case "alterar-pessoas":

                //inplementar

                break;
            case "cadastrar-pessoas-form":


                CadastrarPessoasForm cadastrarPessoasForm = new CadastrarPessoasForm();
                path = cadastrarPessoasForm.executar();


                break;
        }


        String[] metodoECaminho = path.split(":");
        if (metodoECaminho[0].equals("forward")) {
            req.getRequestDispatcher("/WEB-INF/view/" + metodoECaminho[1])
                    .forward(req, res);
        } else if (metodoECaminho[0].equals("redirect")) {
            res.sendRedirect(metodoECaminho[1]);
        }


    }


}
