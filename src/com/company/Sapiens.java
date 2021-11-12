package com.company;

//Челове́к разу́мный (лат. Homo sapiens[К 1];
//преимущественно лат. Homo sapiens sapiens[К 2]) — вид рода Люди (Homo)

public final class Sapiens extends Erectus implements Printable{
    private String profession;
    private Country homeCountry;
    private String nationality;
    private long amountOfMoney;

    public Sapiens(int age, boolean isDead, String gender, String name, Continent placeOfResidence,
                   Erectus husband, String profession, Country homeCountry, long amountOfMoney, String nationality) {
        super(age, isDead, gender, name, placeOfResidence, husband);
        this.profession = profession;
        this.homeCountry = homeCountry;
        this.amountOfMoney = amountOfMoney;
        this.nationality = nationality;
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
                " name='" + super.getName() + '\'' +
                ", isDead='" + super.isDead() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", husband='" + super.getHusband().getName() + '\'' +
                ", profession='" + profession + '\'' +
                ", homeCountry=" + homeCountry.getName() +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }


    public String toSimpleString() {
        return "Sapiens{" +
                " name='" + super.getName() + '\'' +
                '}';
    }


    public Sapiens(String name) {
        super(name);
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

    @Override
    public void printInfo() {
        System.out.println(this.toSimpleString());
    }
}
