package br.com.letscode.letscodejavaee.modelo.acao;

import br.com.letscode.letscodejavaee.dao.BancoDeDados;
import br.com.letscode.letscodejavaee.modelo.Pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse  res;

    public ListarPessoas(HttpServletRequest req, HttpServletResponse res){
        this.req = req;
        this.res = res;

    }

    public String executar(){
        BancoDeDados bd = new BancoDeDados();
        List<Pessoa> pessoas = bd.listar();

        System.out.println(pessoas);

        req.setAttribute("pessoas", pessoas);
        req.setAttribute("titulo", "Listagem de pessoas");

        return "forward:lista-pessoas.jsp";




    }

}
