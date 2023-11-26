package com.martinmunene.reactivemongo.repositories;

import com.martinmunene.reactivemongo.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Martin Munene
 */
public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
