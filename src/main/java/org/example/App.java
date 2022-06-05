package org.example;

import org.example.Model.City;
import org.example.Service.Services;
import org.example.Util.Util;

public class App {
    public static void main(String[] args) {
        Util.connection();
       Services.createCity(); //города
        Services.setCity(1, "Moscow", "Russia", 17000000, 12545);
        Services.setCity(2, "Bishkek", "Kyrgyzstan", 1100000, 4583);
        Services.setCity(3, "London", "Great Britain", 8900000, 123789);
        Services.setCity(4, "Washington", "USA", 689000, 23231);
        Services.setCity(5, "Paris", "France", 2146000, 890234);
        System.out.println(Services.getCities());
        Services.getCityById(4);
        Services.createCountry();
        Services.setCountry(1, "Russia", "Moscow", "Vladimir Putin", 18.8);
        Services.setCountry(2, "USA", "Washington", "Joe Biden", 11.5);
        Services.setCountry(3, "Canada", "Ottawa", "Justin Trudeau", 7.3);
        Services.setCountry(4, "UAE", "Abu Dhabi", "Mohamed bin Zayed Al Nahyan", 1.5);
        Services.setCountry(5, "China", "Beijing", "Xi Jinping", 9.3);
        System.out.println(Services.getCountry());
        Services.createMayor();
        Services.setMayor(1, "Eric", "Honor", 57, "New York");
        Services.setMayor(2, "Anne", "Hidalgo", 45, "Paris");
        Services.setMayor(3, "Aibek", "Dzhunushaliev", 32, "Bishkek");
        Services.setMayor(4, "Sergey", "Sobyanin", 63, "Moscow");
        Services.setMayor(5, "Jahongir", "Ortikxodjaev", 47, "Tashkent");
          System.out.println(Services.getCityMayor());
    }
}
