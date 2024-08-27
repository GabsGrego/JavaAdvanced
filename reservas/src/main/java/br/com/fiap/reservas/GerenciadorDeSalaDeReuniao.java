package br.com.fiap.reservas;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface GerenciadorDeSalaDeReuniao {

    SalaDeReuniao adicionarReserva(LocalDateTime data, Set<String> participantes, Categoria categoria);
    void removerReserva(SalaDeReuniao salaASerRemovida); //throws ReservaNaoEncontradaException;
    List<SalaDeReuniao> listarReservas();
}
