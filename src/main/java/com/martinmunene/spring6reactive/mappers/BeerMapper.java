package com.martinmunene.spring6reactive.mappers;

import com.martinmunene.spring6reactive.domain.Beer;
import com.martinmunene.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @author Martin Munene
 */
@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
