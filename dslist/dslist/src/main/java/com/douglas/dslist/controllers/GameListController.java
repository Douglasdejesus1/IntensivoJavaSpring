package com.douglas.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.dslist.dto.GameDTO;
import com.douglas.dslist.dto.GameListDTO;
import com.douglas.dslist.dto.GameMinDTO;
import com.douglas.dslist.services.GameListService;
import com.douglas.dslist.services.GameService;

@RestController
@RequestMapping(value = "/list-games")

public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id){
	GameListDTO result = gameListService.findById(id);	
		return result;
	}
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	

}
