package hr.from.ivantoplak.petclinic.services;

import hr.from.ivantoplak.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
