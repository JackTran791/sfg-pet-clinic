package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Jack Tran
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
