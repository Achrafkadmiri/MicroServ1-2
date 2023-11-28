package org.activite.activite2.Repositories;

import org.activite.activite2.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

}
