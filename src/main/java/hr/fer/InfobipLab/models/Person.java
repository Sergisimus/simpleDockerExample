package hr.fer.InfobipLab.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue()
    private Long personId;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String name, String surname) {
        this.firstName = name;
        this.lastName = surname;
    }

    public Long getPersonId() {
        return personId;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getSurname() {
        return lastName;
    }

    public void setSurname(String surname) {
        this.lastName = surname;
    }
}
