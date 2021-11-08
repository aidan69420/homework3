package com.company;

public class Main {

    public static void main(String[] args) {
        Country Kyrgyzstan = new Country("Kyrgyzstan", Continent.EURASIA, "Смешанный-Республиканский", 5000000,
                new Sapiens("Садыр Жапаров"));

        Country USA = new Country("USA", Continent.NORTH_AMERICA, "Президенсткий-Республиканский", 329000000,
                new Sapiens("Joe Biden"));


        Erectus erectus = new Erectus();

        //объект класса Sapiens, с моими характеристиками
        Sapiens sapiens1 = new Sapiens(16,
                false,
                "Male",
                Continent.EURASIA,
                new Sapiens("Света"),
                "Айдан Даникеев",
                "В скором времени, программист",
                Kyrgyzstan,
                0);

        //объект класса Sapiens, с характеристиками Илона Маска
        Sapiens sapiens2 = new Sapiens(50,
                false,
                "Male",
                Continent.NORTH_AMERICA,
                new Sapiens("Клэр Буше"),
                "Илон Маск",
                "Предприниматель",
                USA,
                318 /*число 318 000 000 000 не влезло*/);

        System.out.println(sapiens1.toString());
        System.out.println(sapiens2.toString());
        sapiens1.sayHello();
        sapiens2.sayHello();
    }
}
