package com.codeclan.example.wrestlingrankings;

/**
 * Created by user on 12/12/2016.
 */
public class Wrestler {
    private String name;
    private String finisher;
    private int ranking;

    public Wrestler(String name, String finisher, int ranking) {
        this.name = name;
        this.finisher = finisher;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinisher() {
        return finisher;
    }

    public void setFinisher(String finisher) {
        this.finisher = finisher;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Finisher: " + this.finisher + ", Ranking: " + this.ranking;
    }
}
