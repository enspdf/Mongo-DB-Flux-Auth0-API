package me.shackox.webflux.movieapi.repository;

import me.shackox.webflux.movieapi.model.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
