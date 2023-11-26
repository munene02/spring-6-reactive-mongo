package com.martinmunene.reactivemongo.services;

import com.martinmunene.reactivemongo.mappers.BeerMapper;
import com.martinmunene.reactivemongo.model.BeerDTO;
import com.martinmunene.reactivemongo.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author Martin Munene
 */
@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {
    private final BeerMapper beerMapper;
    private final BeerRepository beerRepository;

    @Override
    public Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDto) {
        return beerDto.map(beerMapper::beerDtoToBeer)
                .flatMap(beerRepository::save)
                .map(beerMapper::beerToBeerDto);
    }
    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}