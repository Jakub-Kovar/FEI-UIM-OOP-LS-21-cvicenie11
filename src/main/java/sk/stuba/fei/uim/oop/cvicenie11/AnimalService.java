package sk.stuba.fei.uim.oop.cvicenie11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService {

    @Autowired
    private AnimalRepository repository;

}
