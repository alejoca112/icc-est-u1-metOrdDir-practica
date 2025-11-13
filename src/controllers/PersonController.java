package controllers;
import models.Person;

public class PersonController {
    public void sortByName(Person[] people){
        for(int i = 1; i < people.length ; i++){
            Person key = people[i];
            int j = i -1;
                while(j>=0 && people[j].getName().compareToIgnoreCase(key.getName()) > 0){
                    people[j+1] = people[j];
                    j = j-1;
                }
            people[j+1] = key;
        }
    }

    public void printArray(Person[] people){
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }
    }
}
