package com.example.model;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.Objects;

@MappedEntity(value = "developer")
public class Developer {

    @Id
    private int id;
    private String nick;

    public Developer(int id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return id == developer.id && Objects.equals(nick, developer.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nick);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                '}';
    }
}
