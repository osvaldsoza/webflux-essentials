package br.com.osvaldsoza.webfluxessentials.controller;

import br.com.osvaldsoza.webfluxessentials.domain.Anime;
import br.com.osvaldsoza.webfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
@Slf4j
public class AnimeController {

    private final AnimeRepository animeRepository;

    @GetMapping
    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }

    //TODO assisi aula 5
}
