package com.galvanize.company;

import org.springframework.data.annotation.Id;
/**
 * Created by localadmin on 6/2/16.
 */


final class Company {
    @Id
    private String id;
    private final String name;
    private final int numberOfEmployees;

    Company(final String name, final int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}
