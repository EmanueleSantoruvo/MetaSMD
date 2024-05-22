package com.example.metasmd;

public class SceltaSquadra {

    public int IdNome(String squadra) {
        int teamId;

        switch (squadra) {
            case "Milan":
                teamId = 98;
                break;
            case "Fiorentina":
                teamId = 99;
                break;
            case "Roma":
                teamId = 100;
                break;
            case "Atalanta":
                teamId = 102;
                break;
            case "Bologna":
                teamId = 103;
                break;
            case "Cagliari":
                teamId = 104;
                break;
            case "Genoa":
                teamId = 107;
                break;
            case "Inter":
                teamId = 108;
                break;
            case "Juventus":
                teamId = 109;
                break;
            case "Lazio":
                teamId = 110;
                break;
            case "Napoli":
                teamId = 113;
                break;
            case "Udinese":
                teamId = 115;
                break;
            case "Empoli":
                teamId = 445;
                break;
            case "Verona":
                teamId = 450;
                break;
            case "Salernitana":
                teamId = 455;
                break;
            case "Frosinone":
                teamId = 470;
                break;
            case "Sassuolo":
                teamId = 471;
                break;
            case "Torino":
                teamId = 586;
                break;
            case "Lecce":
                teamId = 5890;
                break;
            case "Monza":
                teamId = 5911;
                break;
            default:
                throw new IllegalArgumentException("Nome della squadra non valido: " + squadra);
        }

        return teamId;
    }
}

