package sk.stuba.fei.uim.oop.cvicenie11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements IAnimalService {


    private AnimalRepository repository;

    @Autowired
    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
        Animal a1 = new Animal();
        a1.setSpecies("Dog");
        this.repository.save(a1);
        Animal a2 = new Animal();
        a2.setSpecies("Cat");
        System.out.println(a2.getId());
        a2 = this.repository.save(a2);
        System.out.println(a2.getId());
    }

    @Override
    public List<Animal> getAll() {
        return this.repository.findAll();
    }
}
