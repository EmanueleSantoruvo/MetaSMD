<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina di benvenuto</title>
</head>
<body>
<h1> <%="Utente " + request.getAttribute("nome") + " " + request.getAttribute("cognome") + " ti sei registrato" %></h1>
</body>
</html>