package org.example;

public class AbrirServidor implements Tarefa{
    private Servidor servidor;

    public AbrirServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public void executar() {
        this.servidor.abrirServidor();
    }

    public void cancelar() {
        this.servidor.fecharServidor();
    }
}
