package hr.from.ivantoplak.petclinic.services;

import hr.from.ivantoplak.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
