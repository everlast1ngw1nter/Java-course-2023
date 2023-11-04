package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    private Task7() {
    }

    public static Animal oldestAnimal(List<Animal> animals, int place) {
        if (animals.size() < place + 1 || place < 0) {
            throw new IllegalArgumentException();
        }
        return animals
                .stream()
                .sorted(Comparator.comparing(Animal::age).reversed())
                .skip(place)
                .findFirst()
                .get();
    }
}
