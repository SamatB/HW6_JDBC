package org.example;

import org.example.Model.City;
import org.example.Service.Services;
import org.example.Util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
//        Util.connection();
//       Services.createCity(); //города
//        Services.setCity(1, "Moscow", "Russia", 17000000, 12545);
//        Services.setCity(2, "Bishkek", "Kyrgyzstan", 1100000, 4583);
//        Services.setCity(3, "London", "Great Britain", 8900000, 123789);
//        Services.setCity(4, "Washington", "USA", 689000, 23231);
//        Services.setCity(5, "Paris", "France", 2146000, 890234);
        System.out.println(Services.getCities());

    }

//    public static void createTable() {
//        String sql = "create table if not exists cities" +
//                "(id int primary key," +
//                "name varchar(40)," +
//                "country_name varchar(40)," +
//                "population int,"+
//                "indexes int);";
//        try (Connection conn = Util.connection();
//             Statement statement = conn.createStatement()) {
//            statement.executeUpdate(sql);
//            System.out.println("Table created");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void setCity(int id, String name, String country_name,int population, int indexes) {
//        String sql = "insert into cities(id, name, country_name, population, indexes) values(?, ?, ?, ?, ?);";
//        try (Connection conn = Util.connection();
//             PreparedStatement statement = conn.prepareStatement(sql)) {
//            statement.setInt(1, id);
//            statement.setString(2, name);
//            statement.setString(3, country_name);
//            statement.setInt(4, population);
//            statement.setInt(5, indexes);
//            statement.executeUpdate();
//            System.out.println("Information set");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<City> getCities() {
//        String sql = "select * from cities;";
//        List<City> cities = new ArrayList<>();
//        try (Connection conn = Util.connection();
//             Statement statement = conn.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)){
//            while (resultSet.next()) {
//                City city = new City();
//                city.setId(resultSet.getInt("id"));
//                city.setName(resultSet.getString("name"));
//                city.setCountryName(resultSet.getString("country_name"));
//                city.setPopulation(resultSet.getInt("population"));
//                city.setIndexes(resultSet.getInt("indexes"));
//                cities.add(city);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return cities;
//    }
}
