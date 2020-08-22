package pl.piomin.microservices.customer.data;


import org.springframework.data.repository.CrudRepository;

import pl.piomin.microservices.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	public Customer findByPesel(String pesel);
	public Customer findById(String id);
	
}
