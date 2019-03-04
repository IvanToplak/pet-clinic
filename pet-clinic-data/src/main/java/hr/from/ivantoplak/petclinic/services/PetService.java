package hr.from.ivantoplak.petclinic.services;

import hr.from.ivantoplak.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
