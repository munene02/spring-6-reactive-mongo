package com.martinmunene.reactivemongo.services;

import com.martinmunene.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

/**
 * @author Martin Munene
 */
public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDto) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}
