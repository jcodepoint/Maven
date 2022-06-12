package com.jcodepoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolarSystemInfoTest {

	@Test
    public void testMercurySatelliteCount() {
    	assertEquals(0, SolarSystemInfo.getMercurySatelliteCount());
    }

	@Test
    public void testEarthSatelliteCount() {
    	assertEquals(1, SolarSystemInfo.getEarthSatelliteCount());
    }

}
