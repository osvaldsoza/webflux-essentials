package br.com.osvaldsoza.webfluxessentials.repository;

import br.com.osvaldsoza.webfluxessentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime,Integer> {
}
