package br.com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository <Evento, String>{

}
