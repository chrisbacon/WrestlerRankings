package com.codeclan.example.wrestlingrankings;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class RankingsTest {

    Rankings rankings;

    @Before
    public void before() {
        Wrestler wrestler = new Wrestler("Stone Cold Steve Austin", "Stone Cold Stunner", 1);
        Wrestler wrestler2 = new Wrestler("The Rock", "Rock Bottom", 2);
        Wrestler wrestler3 = new Wrestler("Mick Foley", "Double Underhook DDT", 3);
        rankings = new Rankings(3);
        rankings.add(wrestler);
        rankings.add(wrestler2);
        rankings.add(wrestler3);
    }

    @Test
    public void getWrestlerAtRankTest() {
        Wrestler wrestler = rankings.getWrestlerAtRank(1);
        assertEquals("Stone Cold Steve Austin", wrestler.getName());
    }

    @Test
    public void replaceLastPlaceTest() {
        Wrestler new_wrestler = new Wrestler("HHH", "Pedigree", 3);
        rankings.replaceLastPlace(new_wrestler);

        Wrestler wrestler = rankings.getWrestlerAtRank(3);
        assertEquals("HHH", wrestler.getName());
    }
}
