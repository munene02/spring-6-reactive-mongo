package com.martinmunene.reactivemongo.services;

import com.martinmunene.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

/**
 * @author Martin Munene
 */
public interface BeerService {
    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDto);

    Mono<BeerDTO> getById(String beerId);
}
