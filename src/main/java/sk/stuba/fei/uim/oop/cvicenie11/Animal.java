package sk.stuba.fei.uim.oop.cvicenie11;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private Long id;

    private String species;
}
