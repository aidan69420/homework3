package com.company;

//Человек прямоходящий (лат. Homo erectus) или человек выпрямленный
//(устар. архантропы), — ископаемый вид людей, который рассматривают как непосредственного предка современных людей

public class Erectus extends Homo{
    private Continent placeOfResidence;
    private Erectus husband;

    public Erectus(){}

    public Erectus(int age, boolean isDead, String gender, Continent placeOfResidence, Erectus husband) {
        super(age, isDead, gender);
        this.placeOfResidence = placeOfResidence;
        this.husband = husband;
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

    public Erectus getHusband() {
        return husband;
    }
}
