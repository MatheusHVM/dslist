package com.games.dslist.services;

import com.games.dslist.dto.GameMinDTO;
import com.games.dslist.entities.Game;
import org.springframework.stereotype.Service;
import com.games.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

