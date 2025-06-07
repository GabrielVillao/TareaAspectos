package com.example.SingletonAOP;

public aspect SingletonAspect {
    private Configuracion instancia;

    Configuracion around(): call(Configuracion.new()) {
        if (instancia == null) {
            instancia = proceed();
        }
        return instancia;
    }
    public Configuracion getInstancia() {
        return instancia;
    }
}