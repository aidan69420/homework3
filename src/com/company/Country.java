package com.company;

public class Country {
    private String name;
    private Continent continent;
    private String politicalSystem;
    private int population;
    private Sapiens headOfState;

    public Country(String name, Continent continent, String politicalSystem, int population, Sapiens headOfState) {
        this.name = name;
        this.continent = continent;
        this.politicalSystem = politicalSystem;
        this.population = population;
        this.headOfState = headOfState;
    }

    public void changeOfPoliticalSystem(Sapiens newHeadOfState, String newPoliticalSystem){
        politicalSystem = newPoliticalSystem;
        headOfState = newHeadOfState;
        System.out.println("Государство " + this.name + " поменяло свой государственный строй, на " + this.politicalSystem +
                ". Новый глава государства: " + this.headOfState.getName());
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent=" + continent +
                ", politicalSystem='" + politicalSystem + '\'' +
                ", population=" + population +
                ", headOfState=" + headOfState.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getPoliticalSystem() {
        return politicalSystem;
    }

    public int getPopulation() {
        return population;
    }

    public Sapiens getHeadOfState() {
        return headOfState;
    }
}
