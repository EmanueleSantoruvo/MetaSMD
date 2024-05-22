<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.http.HttpClient" %>
<%@ page import="java.net.http.HttpRequest" %>
<%@ page import="java.net.http.HttpResponse" %>
<%@ page import="java.net.URI" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dettagli Squadra</title>
</head>
<body>
<h1>Dettagli della Squadra</h1>
<%
    int teamId = (Integer) request.getAttribute("teamId");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest richiesta = HttpRequest.newBuilder()
            .uri(URI.create("http://api.football-data.org/v4/teams/" + teamId))
            .header("X-Auth-Token", "7263e66e5c6d4fcf88b42ef8254a3329")
            .build();
    HttpResponse<String> risposta = client.send(richiesta, HttpResponse.BodyHandlers.ofString());

%>
</body>
</html>
