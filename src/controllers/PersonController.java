package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < personas.length - i - 1; j++) {
                String a = personas[j].getName();
                String b = personas[j + 1].getName();
                if (a == null)
                    a = "";
                if (b == null)
                    b = "";
                int cmp = a.compareToIgnoreCase(b);
                if (cmp > 0 || (cmp == 0 && a.compareTo(b) > 0)) {
                    // Intercambio Correspondiente
                    Person tmp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
            // algo se hace

        }
    }
}
