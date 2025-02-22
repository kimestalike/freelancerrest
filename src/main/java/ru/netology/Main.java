package ru.netology;

import ru.netology.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}