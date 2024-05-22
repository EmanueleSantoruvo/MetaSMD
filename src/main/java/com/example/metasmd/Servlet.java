package com.example.metasmd;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/SERVLET"})
class SERVLET extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SERVLET() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        String squadra = request.getParameter("squadra");
        SceltaSquadra sceltaSquadra = new SceltaSquadra();
        int teamId;

        try {
            teamId = sceltaSquadra.IdNome(squadra);
        } catch (IllegalArgumentException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Nome della squadra non valido");
            return;
        }

        request.setAttribute("teamId", teamId);
        request.getRequestDispatcher("Squadra.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
