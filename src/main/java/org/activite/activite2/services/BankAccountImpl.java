package org.activite.activite2.services;

import org.activite.activite2.Repositories.BankAccountRepository;
import org.activite.activite2.dtos.BankAccountRequestDTO;
import org.activite.activite2.dtos.BankAccountResponseDTO;
import org.activite.activite2.entities.BankAccount;
import org.activite.activite2.mappers.BankAccountMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

@Service
public class BankAccountImpl implements BankAccountService{
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Autowired
    BankAccountMapper bankAccountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccount) {

         BankAccount bank=bankAccountMapper.toBank(bankAccount);
        BankAccount bankAccount1= bankAccountRepository.save(bank);
        BankAccountResponseDTO bankAccountResponseDTO=bankAccountMapper.fromBank(bankAccount1);

        return bankAccountResponseDTO;
    }
}
