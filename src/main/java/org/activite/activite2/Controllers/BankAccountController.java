package org.activite.activite2.Controllers;

import org.activite.activite2.Repositories.BankAccountRepository;
import org.activite.activite2.dtos.BankAccountRequestDTO;
import org.activite.activite2.dtos.BankAccountResponseDTO;
import org.activite.activite2.entities.BankAccount;
import org.activite.activite2.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankAccountController {
    @Autowired
    private BankAccountRepository compteService;
    @Autowired
    private BankAccountService bankAccountService;


    @PostMapping("/createCompte")
    public BankAccountResponseDTO createCompte(@RequestBody BankAccountRequestDTO compte) {
        return bankAccountService.addAccount(compte);
    }

    @GetMapping("/getCompte/{id}")
    public BankAccount getCompte(@PathVariable String id) {
        return compteService.findById(id).get();
    }

    @GetMapping("/getAllComptes")
    public List<BankAccount> getAllComptes() {
        return compteService.findAll();
    }

    @PutMapping("/updateCompte/{id}")
    public BankAccount updateCompte(@RequestBody BankAccount compte) {
        return compteService.save(compte);
    }

    @DeleteMapping("/deleteCompte/{id}")
    public void deleteCompte(@PathVariable String id) {
        compteService.deleteById(id);
    }

}
