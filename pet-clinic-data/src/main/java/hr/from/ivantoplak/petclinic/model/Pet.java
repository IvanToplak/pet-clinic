package hr.from.ivantoplak.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity{
    private static final long serialVersionUID = 1L;

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
