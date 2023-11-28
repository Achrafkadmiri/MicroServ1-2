package org.activite.activite2;

import org.activite.activite2.Repositories.BankAccountRepository;
import org.activite.activite2.entities.AccountType;
import org.activite.activite2.entities.BankAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication

public class Activite2Application {

	public static void main(String[] args) {

		SpringApplication.run(Activite2Application.class, args);
	}

	@Bean
	CommandLineRunner runner(BankAccountRepository bankAccountRepository){
	return args -> {
			for (int i=0;i<=5;i++){
				BankAccount bankAccount=BankAccount.builder()
						.id(UUID.randomUUID().toString())
						.balance(2000)
						.createdAt(new Date())
						.type(AccountType.SAVING_ACCOUNT)
						.build();
				bankAccountRepository.save(bankAccount);
			}
		};
	}
}

