package com.codeclan.example.wrestlingrankings;

import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Rankings {

    private ArrayList<Wrestler> rankings;

    public Rankings(int size) {
        this.rankings = new ArrayList<Wrestler>();
        for (int i=0; (i < size); i++) {
            this.rankings.add(null);
        }
    }

    public void add(Wrestler wrestler) {
        int index = wrestler.getRanking() - 1;
        this.rankings.set(index, wrestler);
    }

    public Wrestler getWrestlerAtRank(int rank) {
        int index = rank - 1;
        return this.rankings.get(index);
    }

    public void replaceLastPlace(Wrestler wrestler) {
        int index = this.rankings.size() - 1;
        this.rankings.set(index, wrestler);
    }

    public Wrestler getWrestlerByName(String name) {
        Wrestler target = null;
        for (Wrestler wrestler : this.rankings) {
            if (wrestler.getName().equals(name)) {
                target = wrestler;
            }
        }
        return target;
    }



}
