package com.projetoheroes.heroesapi.repository;

import com.projetoheroes.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository; // Habilita requisiçoes basicas em uma api no nosso repositorio

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{

}
