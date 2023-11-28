package org.activite.activite2.services;

import org.activite.activite2.dtos.BankAccountRequestDTO;
import org.activite.activite2.dtos.BankAccountResponseDTO;
import org.activite.activite2.entities.BankAccount;
import org.springframework.stereotype.Service;


public interface BankAccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccount);
}
