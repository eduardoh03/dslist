package com.eduardoh.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.eduardoh.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
