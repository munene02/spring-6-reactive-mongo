package com.martinmunene.reactivemongo.mappers;

import com.martinmunene.reactivemongo.domain.Beer;
import com.martinmunene.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @author Martin Munene
 */
@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
