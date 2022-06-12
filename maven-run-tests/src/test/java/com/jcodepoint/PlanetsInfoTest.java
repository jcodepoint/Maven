package com.jcodepoint;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlanetsInfoTest {

	@Test
    public void testPlanets() {
    	assertTrue(SolarSystemInfo.getPlanets().contains("Earth"));
    }
	
}
