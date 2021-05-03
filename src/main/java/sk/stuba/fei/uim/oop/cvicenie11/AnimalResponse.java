package sk.stuba.fei.uim.oop.cvicenie11;

import lombok.Getter;

@Getter
public class AnimalResponse {
    private String species;

    public AnimalResponse(Animal a) {
        this.species = a.getSpecies();
    }
}
