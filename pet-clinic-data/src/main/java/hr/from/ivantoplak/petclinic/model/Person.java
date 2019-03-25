package hr.from.ivantoplak.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
}
