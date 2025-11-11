package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].getName().compareTo(personas[j+1].getName()) > 0) {
                    // Intercambio Correspondiente
                    Person temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                //algo se hace
                break;
            }
            

        }
    }
}
