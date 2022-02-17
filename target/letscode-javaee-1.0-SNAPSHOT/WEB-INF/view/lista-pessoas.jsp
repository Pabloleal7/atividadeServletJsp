<%@ page import="java.util.List" %>
<%@ page import="br.com.letscode.letscodejavaee.modelo.Pessoa" %>
<%
    String titulo = "Lista de Pessoas";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Pessoas</title>
</head>
<body>
<% out.println(titulo); %>
<ul>

    <% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas");  %>


    <%
    for(Pessoa pessoa: pessoas){
        %>
    <li>Nome:<%=pessoa.getNome()%></li>
    <li>Sobrenome:<%=pessoa.getSobrenome()%></li>
    <li>Idade:<%=pessoa.getIdade()%></li>
    <li>Data:<%=pessoa.getData()%></li>
    <br>
        <%
    }
    %>



</ul>
</body>
</html>