package org.example;

public class Servidor {
    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void abrirServidor() {
        this.situacao = "Servidor aberto";
    }

    public void fecharServidor() {
        this.situacao = "Servidor fechado";
    }
}
