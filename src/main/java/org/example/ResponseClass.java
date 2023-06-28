package org.example;

public class ResponseClass {
    int numberOfCharacters;

    @Override
    public String toString() {
        return "{ \"numberOfCharacters\" : " + numberOfCharacters + '}';
    }
}
