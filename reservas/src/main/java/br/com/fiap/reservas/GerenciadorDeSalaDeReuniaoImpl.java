package br.com.fiap.reservas;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GerenciadorDeSalaDeReuniaoImpl implements GerenciadorDeSalaDeReuniao {

   private List<SalaDeReuniao> listaDeSalasDeReuniao;

    @Override
    /*public SalaDeReuniao adicionarReserva(LocalDateTime data, Set<String> participantes, Categoria categoria) {
        listaDeSalasDeReuniao.add(new SalaDeReuniao());
        return SalaDeReuniao;
    }*/
    public SalaDeReuniao adicionarReserva(SalaDeReuniao reserva) {
        listaDeSalasDeReuniao.add(reserva);
        return reserva;
    }

    @Override
    public void removerReserva(SalaDeReuniao salaASerRemovida) {

    }

    @Override
    public List<SalaDeReuniao> listarReservas() {
        return List.of();
    }


}
