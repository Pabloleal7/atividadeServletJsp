package br.com.letscode.letscodejavaee.modelo.acao;

import br.com.letscode.letscodejavaee.dao.BancoDeDados;
import br.com.letscode.letscodejavaee.modelo.Pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse res;



    public CadastrarPessoas(HttpServletRequest req, HttpServletResponse res) {
        this.req = req;
        this.res = res;
    }

    public String executar(){
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade  = req.getParameter("idade");
        String data = req.getParameter("data");

        Pessoa pessoaModelo = new Pessoa(nome,sobrenome,idade,data);

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoaModelo);

        return "redirect:/app/controlador?acao=listar-pessoas";
    }
}
