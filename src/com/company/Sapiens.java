package com.company;

//Челове́к разу́мный (лат. Homo sapiens[К 1];
//преимущественно лат. Homo sapiens sapiens[К 2]) — вид рода Люди (Homo)

public final class Sapiens extends Erectus{
    private String name;
    private String profession;
    private Country homeCountry;
    private long amountOfMoney;

    public Sapiens(String name, String profession, Country homeCountry, long amountOfMoney) {
        this.name = name;
        this.profession = profession;
        this.homeCountry = homeCountry;
        this.amountOfMoney = amountOfMoney;
    }

    public Sapiens(int age, boolean isDead, String gender, Continent placeOfResidence, Erectus husband, String name,
                   String profession, Country homeCountry, long amountOfMoney) {
        super(age, isDead, gender, placeOfResidence, husband);
        this.name = name;
        this.profession = profession;
        this.homeCountry = homeCountry;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public void sayHello() {
        if (this.homeCountry.getName() == "Russia" || this.homeCountry.getName() == "Kyrgyzstan"){
            System.out.println("Привет!");
        }else if (this.homeCountry.getName() == "France"){
            System.out.println("Bonjour!");
        }else {
            System.out.println("Hello!");
        }
    }

    @Override
    public String toString() {
        return "Sapiens{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", homeCountry=" + homeCountry +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    public Sapiens(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public Country getHomeCountry() {
        return homeCountry;
    }

    public long getAmountOfMoney() {
        return amountOfMoney;
    }
}
