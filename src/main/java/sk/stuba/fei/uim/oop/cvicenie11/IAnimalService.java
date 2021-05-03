package sk.stuba.fei.uim.oop.cvicenie11;

import java.util.List;

public interface IAnimalService {
    List<Animal> getAll();
    Animal create(AnimalRequest request);
}
