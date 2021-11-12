package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Den").printInfo();
        createObject("Nean").printInfo();
        createObject("Sap").printInfo();



//        Country Kyrgyzstan = new Country("Kyrgyzstan", Continent.EURASIA, "Смешанный-Республиканский", 6000000,
//                new Sapiens("Садыр Жапаров"));
//
//        Country USA = new Country("USA", Continent.NORTH_AMERICA, "Президенсткий-Республиканский", 329000000,
//                new Sapiens("Джо Байден"));
//
//
//        Erectus erectus = new Erectus();
//
//        //объект класса Sapiens, с моими характеристиками
//        Sapiens sapiens1 = new Sapiens(16,
//                false,
//                "Male",
//                "Айдан Даникеев",
//                Continent.EURASIA,
//                new Sapiens("Света Реушева"),
//                "В скором времени программист",
//                Kyrgyzstan,
//                15000,
//                "Еврей");
//
//        //объект класса Sapiens, с характеристиками Илона Маска
//        Sapiens sapiens2 = new Sapiens(50,
//                false,
//                "Male",
//                "Илон Маск",
//                Continent.NORTH_AMERICA,
//                new Sapiens("Клэр Буше"),
//                "Предприниматель",
//                USA,
//                318000000 /*число 318 000 000 000 не влезло*/,
//                "Белый Южно-Африканец");
//
//        System.out.println(sapiens1.toString());
//        System.out.println(sapiens2.toString());
//        sapiens1.sayHello();
//        sapiens2.sayHello();
    }
    public static Homo createObject(String className){
        if (className == "Den" || className == "Denisovensis"){
            return new Denisovensis("Уга-Буга");
        }else if (className == "Nean" || className == "Neanderthalensis"){
            return new Neanderthalensis("Буга-Уга");
        }else if (className == "Sap" || className == "Sapiens"){
            return new Sapiens("Alex");
        }else{
            return new Homo();
        }
    }
}
