package org.activite.activite2.mappers;

import org.activite.activite2.dtos.BankAccountRequestDTO;
import org.activite.activite2.dtos.BankAccountResponseDTO;
import org.activite.activite2.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class BankAccountMapper {
    public BankAccountResponseDTO fromBank(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO=new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
    public BankAccount toBank(BankAccountRequestDTO bankAccountRequestDTO){
        BankAccount bankAccount=BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .build();
        BeanUtils.copyProperties(bankAccountRequestDTO,bankAccount);
        return bankAccount;
    }
}
