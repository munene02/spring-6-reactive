package com.martinmunene.spring6reactive.repositories;

import com.martinmunene.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Martin Munene
 */
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}
