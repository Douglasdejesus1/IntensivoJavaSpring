package com.douglas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
	
}
