package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Encja użytkownika
 * nazwa musi być inna niż User przez nasz hosting
 */
@Entity
public class TaskifyUser {
    /**
     * klucz główny, automatycznie generowany
     */
    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String password;

    private String name;

    private String surname;

    public TaskifyUser() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
