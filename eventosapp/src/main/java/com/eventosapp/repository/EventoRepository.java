package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long>{
	Evento findByCodigo(long codigo);
	
	
}
