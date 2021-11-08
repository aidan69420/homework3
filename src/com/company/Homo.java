package com.company;

//Лю́ди(лат. Homo) — род в семействе гоминиды отряда приматов. Включает вид человек разумный

public class Homo {
    private int age;
    private boolean isDead;
    private String gender;

    public Homo(int age, boolean isDead, String gender) {
        this.age = age;
        this.isDead = isDead;
        this.gender = gender;
    }

    public void kill(){
        if (!this.isDead){
            this.isDead = true;
        }
    }

    public Homo(){}

    public int getAge() {
        return age;
    }

    public boolean isDead() {
        return isDead;
    }

    public String getGender() {
        return gender;
    }
}
