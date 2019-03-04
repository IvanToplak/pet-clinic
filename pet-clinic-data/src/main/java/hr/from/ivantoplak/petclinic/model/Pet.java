package hr.from.ivantoplak.petclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity{
    private static final long serialVersionUID = 1L;

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
