package org.example.Model;

public class Country {
    private int id;
    private String name;
    private String capital;
    private String president;
    private double budget;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "\nCountry: " +
                "id - " + id +
                ", name - " + name +
                ", capital - " + capital +
                ", president - " + president +
                ", budget - " + budget;
    }
}
