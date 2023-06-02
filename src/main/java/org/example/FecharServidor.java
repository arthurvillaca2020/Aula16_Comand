package org.example;

public class FecharServidor implements Tarefa{
    private Servidor servidor;

    public FecharServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public void executar() {
        this.servidor.fecharServidor();
    }

    public void cancelar() {
        this.servidor.abrirServidor();
    }
}
