package com.algaworks.algashop.ordering.repository;

import com.algaworks.algashop.ordering.domain.model.entity.Customer;
import com.algaworks.algashop.ordering.domain.model.valueobject.id.CustomerId;

public interface Customers extends Repository<Customer, CustomerId> {
}