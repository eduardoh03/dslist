package com.eduardoh.dslist.services;

import com.eduardoh.dslist.dto.GameMinDTO;
import com.eduardoh.dslist.entities.Game;
import com.eduardoh.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
