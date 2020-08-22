package pl.piomin.microservices.account.data;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import pl.piomin.microservices.account.model.Account;

public interface AccountRepository extends CrudRepository<Account, String> {

    public Account findByNumber(String number);
    public List<Account> findByCustomerId(String customerId);
    
}
