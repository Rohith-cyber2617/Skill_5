package klu.Spring_Boot_Demo;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 101;
        this.name = "Java Programming";
        this.dateOfCompletion = "2026-03-01";
    }

    public String toString() {
        return "Certification ID: " + id +
               ", Name: " + name +
               ", Date: " + dateOfCompletion;
    }
}



