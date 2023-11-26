package com.martinmunene.reactivemongo.services;

import com.martinmunene.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Martin Munene
 */
public interface BeerService {
    Flux<BeerDTO> findByBeerStyle(String beerStyle);
    Mono<BeerDTO> findFirstByBeerName(String beerName);
    Flux<BeerDTO> listBeers();
    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDto);

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);
    Mono<BeerDTO> getById(String beerId);

    Mono<BeerDTO> updateBeer(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);
}
