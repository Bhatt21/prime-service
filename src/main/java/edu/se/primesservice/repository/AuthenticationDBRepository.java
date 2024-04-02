package edu.se.primesservice.repository;

import edu.se.primesservice.model.Customer;

@Repository
public interface AuthenticationDBRepository
    extends CrudRepository<Customer, String>
{
    Customer findByUsername(String username);
}
