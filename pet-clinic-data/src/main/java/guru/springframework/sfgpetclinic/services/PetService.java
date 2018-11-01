package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Jack Tran
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
