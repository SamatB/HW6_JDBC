package org.example.Model;

public class City {
    private int id;
    private String name;
    private String countryName;
    private int population;
    private int indexes;

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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getIndexes() {
        return indexes;
    }

    public void setIndexes(int indexes) {
        this.indexes = indexes;
    }

    @Override
    public String toString() {
        return "\nCity: " +
                "id - " + id +
                ", name - " + name +
                ", country name - " + countryName +
                ", population - " + population +
                ", indexes - " + indexes;
    }
}
