package org.example.Model;

public class CityMayor {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String city;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nCityMayor: " +
                "id - " + id +
                ", name - " + name +
                ", surname - " + surname +
                ", age - " + age +
                ",mayor of " + city + " city";
    }
}
