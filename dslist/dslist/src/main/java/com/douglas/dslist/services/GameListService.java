package com.douglas.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglas.dslist.dto.GameDTO;
import com.douglas.dslist.dto.GameListDTO;
import com.douglas.dslist.dto.GameMinDTO;
import com.douglas.dslist.entities.Game;
import com.douglas.dslist.entities.GameList;
import com.douglas.dslist.repositories.GameListRepository;
import com.douglas.dslist.repositories.GameRepository;

@Service
public class GameListService {
		
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {
		GameList result = gameListRepository.findById(id).get();
		GameListDTO dto = new GameListDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x-> new GameListDTO(x)).toList();
		return dto;
	}

}
