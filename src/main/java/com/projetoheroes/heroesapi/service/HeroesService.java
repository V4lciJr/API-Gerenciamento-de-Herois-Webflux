package com.projetoheroes.heroesapi.service;

import com.projetoheroes.heroesapi.document.Heroes;
import com.projetoheroes.heroesapi.repository.HeroesRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService {
    private final HeroesRepository heoresRepository;

    public HeroesService(HeroesRepository heoresRepository){
        this.heoresRepository = heoresRepository;
    }

    public Flux<Heroes> findAll(){
        return Flux.fromIterable(this.heoresRepository.findAll());
    }

    public Mono<Heroes> findByIdHero(String id){
        return Mono.justOrEmpty(this.heoresRepository.findById(id));
    }

    public Mono<Heroes> save(Heroes heroes){
        return Mono.justOrEmpty(this.heoresRepository.save(heroes));
    }

    public Mono<Boolean> deleteByIdHero(String id){
        heoresRepository.deleteById(id);
        return Mono.just(true);
    }
}
