<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.http.HttpClient" %>
<%@ page import="java.net.http.HttpRequest" %>
<%@ page import="java.net.http.HttpResponse" %>
<%@ page import="java.net.http.HttpResponse.BodyHandlers" %>
<%@ page import="java.net.URI" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1></h1>
<%

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest richiesta = HttpRequest.newBuilder()
            .uri(URI.create("http://api.football-data.org/v4/teams/"))
            .header("X-Auth-Token", "7263e66e5c6d4fcf88b42ef8254a3329")
            .build();
    HttpResponse<String> rischiesta = client.send(richiesta, BodyHandlers.ofString());
%>
</body>
</html>