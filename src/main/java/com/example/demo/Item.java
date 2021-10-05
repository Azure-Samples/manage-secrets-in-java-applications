package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private int Id;

    private String details;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Id != item.Id) return false;
        return details != null ? details.equals(item.details) : item.details == null;
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (details != null ? details.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "Id=" + Id +
                ", details='" + details + '\'' +
                '}';
    }
}
