package com.sofka.software;
import com.sofka.software.utilities.abstracts.Animal;
import com.sofka.software.utilities.interfaces.CatInterface;

/**
 * clase gato, esta clase tiene metodo de maullar, extiende de clase padre animal
 */
public class Cat extends Animal implements CatInterface {
    @Override
    public void maullar() {
        // TODO document why this method is empty
    }
}


