package org.example.Service;

import org.example.Model.City;
import org.example.Model.CityMayor;
import org.example.Model.Country;
import org.example.Util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Services {
    public static void createCity() {
        String sql = "create table if not exists cities" +
                "(id int primary key," +
                "name varchar(40)," +
                "country_name varchar(40)," +
                "population int," +
                "indexes int);";
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createCountry() {
        String sql = "create table if not exists countries" +
                "(id int primary key," +
                "name varchar(40)," +
                "capital varchar(40)," +
                "president varchar(50)," +
                "budget double precision);";
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createMayor() {
        String sql = "create table if not exists city_mayor" +
                "(id int primary key," +
                "name varchar(30)," +
                "surname varchar(30)," +
                "age int," +
                "city varchar(50));";
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setCity(int id, String name, String country_name, int population, int indexes) {
        String sql = "insert into cities(id, name, country_name, population, indexes) values(?, ?, ?, ?, ?);";
        try (Connection conn = Util.connection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, country_name);
            statement.setInt(4, population);
            statement.setInt(5, indexes);
            statement.executeUpdate();
            System.out.println("Information set");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setCountry(int id, String name, String capital, String president, double budget) {
        String sql = "insert into countries(id, name, capital, president, budget) values(?, ?, ?, ?, ?);";
        try (Connection conn = Util.connection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, capital);
            statement.setString(4, president);
            statement.setDouble(5, budget);
            statement.executeUpdate();
            System.out.println("Information set");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setMayor(int id, String name, String surname, int age, String city) {
        String sql = "insert into city_mayor(id, name, surname, age, city) values(?, ?, ?, ?, ?);";
        try (Connection conn = Util.connection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, surname);
            statement.setInt(4, age);
            statement.setString(5, city);
            statement.executeUpdate();
            System.out.println("Information set");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<City> getCities() {
        String sql = "select * from cities;";
        List<City> cities = new ArrayList<>();
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setCountryName(resultSet.getString("country_name"));
                city.setPopulation(resultSet.getInt("population"));
                city.setIndexes(resultSet.getInt("indexes"));
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    public static List<Country> getCountry() {
        String sql = "select * from countries;";
        List<Country> countries = new ArrayList<>();
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("id"));
                country.setName(resultSet.getString("name"));
                country.setCapital(resultSet.getString("capital"));
                country.setPresident(resultSet.getString("president"));
                country.setBudget(resultSet.getDouble("budget"));
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static void getCityById(int id) throws IndexOutOfBoundsException {
        City[] cities = getCities().toArray(new City[0]);
        ArrayList<Integer> list = new ArrayList<>();
        for (City city : cities) {
            list.add(city.getId());
            if (city.getId() == id) {
                System.out.println(city);
            }
        }
        try {
            if (!list.contains(id)) {
                throw new IndexOutOfBoundsException("There is no any city with this id");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<CityMayor> getCityMayor() {
        String sql = "select * from city_mayor;";
        List<CityMayor> mayor = new ArrayList<>();
        try (Connection conn = Util.connection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                CityMayor cityMayor = new CityMayor();
                cityMayor.setId(resultSet.getInt("id"));
                cityMayor.setName(resultSet.getString("name"));
                cityMayor.setSurname(resultSet.getString("surname"));
                cityMayor.setAge(resultSet.getInt("age"));
                cityMayor.setCity(resultSet.getString("city"));
                mayor.add(cityMayor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mayor;
    }
}
