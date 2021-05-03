package sk.stuba.fei.uim.oop.cvicenie11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements IAnimalService {

    @Autowired
    private AnimalRepository repository;

    @Override
    public List<Animal> getAll() {
        return this.repository.findAll();
    }
}
