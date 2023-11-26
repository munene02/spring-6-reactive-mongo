package com.martinmunene.reactivemongo.repositories;

import com.martinmunene.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Martin Munene
 */
public interface CustomerRepsoitory extends ReactiveMongoRepository<Customer, String> {
}
