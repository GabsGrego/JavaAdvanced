package br.com.fiap.reservas;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

public class SalaDeReuniao{

    private Categoria categoria;

    private Map<LocalDateTime, Set<String>> reunioes;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Map<LocalDateTime, Set<String>> getReunioes() {
        return reunioes;
    }

    public void setReunioes(Map<LocalDateTime, Set<String>> reunioes) {
        this.reunioes = reunioes;
    }
}
