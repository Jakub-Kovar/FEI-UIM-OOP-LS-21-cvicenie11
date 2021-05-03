package sk.stuba.fei.uim.oop.cvicenie11;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Animal {
    @Id
    private Long id;

    private String species;
}
