package com.codeclan.example.wrestlingrankings;

import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class WrestlerTest {
    Wrestler wrestler;

    @Before
    public void before() {
        this.wrestler = new Wrestler("Stone Cold Steve Austin", "Stone Cold Stunner", 1);
    }

    @Test
    public void getNameTest() {
        assertEquals("Stone Cold Steve Austin", wrestler.getName());
    }

    @Test
    public void setNameTest() {
        wrestler.setName("Stunning Steve Austin");
        assertEquals("Stunning Steve Austin", wrestler.getName());
    }

    @Test
    public void getFinisherTest() {
        assertEquals("Stone Cold Stunner", wrestler.getFinisher());
    }

    @Test
    public void setFinisherTest() {
        wrestler.setFinisher("Stun Gun");
        assertEquals("Stun Gun", wrestler.getFinisher());
    }

    @Test
    public void getRankingTest() {
        assertEquals(1, wrestler.getRanking());
    }

    public void setRankingTest() {
        wrestling.setRanking(2);
        assertEquals(2, wrestler.getRanking());
    }

}
