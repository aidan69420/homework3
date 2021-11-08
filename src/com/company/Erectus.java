package com.company;

//Человек прямоходящий (лат. Homo erectus) или человек выпрямленный
//(устар. архантропы), — ископаемый вид людей, который рассматривают как непосредственного предка современных людей

public class Erectus extends Homo{
    private String name;
    private Continent placeOfResidence;
    private Erectus husband;

    public Erectus(){}

    public Erectus(String name) {
        this.name = name;
    }

    public Erectus(int age, boolean isDead, String gender, String name, Continent placeOfResidence, Erectus husband) {
        super(age, isDead, gender);
        this.name = name;
        this.placeOfResidence = placeOfResidence;
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Erectus{" +
                "placeOfResidence=" + placeOfResidence +
                ", husband=" + husband +
                '}';
    }

    public void sayHello(Homo companion){
        System.out.println("Уга-Буга!!!");
        companion.kill();
    }

    public void sayHello(){
        System.out.println("Уга-Буга?!?!");
    }

    public final void changeThePlaceOfResidence(Continent newPlaceOfResidence){
        placeOfResidence = newPlaceOfResidence;
    }

    public final void changeThePlaceOfResidence(){
        this.kill();
    }

    public Continent getPlaceOfResidence() {
        return placeOfResidence;
    }

    public String getName() {
        return name;
    }

    public Erectus getHusband() {
        return husband;
    }
}
