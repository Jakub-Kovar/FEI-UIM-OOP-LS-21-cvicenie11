package sk.stuba.fei.uim.oop.cvicenie11;

import lombok.Getter;

@Getter
public class AnimalResponse {

    private Long id;

    private String species;

    public AnimalResponse(Animal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
    }
}
