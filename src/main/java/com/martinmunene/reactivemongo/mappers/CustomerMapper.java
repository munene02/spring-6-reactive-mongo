package com.martinmunene.reactivemongo.mappers;

import com.martinmunene.reactivemongo.domain.Customer;
import com.martinmunene.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * @author Martin Munene
 */
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
