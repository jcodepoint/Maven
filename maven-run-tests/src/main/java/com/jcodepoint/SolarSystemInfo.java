package com.jcodepoint;

import java.util.Arrays;
import java.util.List;

public class SolarSystemInfo {

	private static List<String> planets = 
			Arrays.asList(
					new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"});

	public static List<String> getPlanets(){
		return planets;
	}
	
	public static int getMercurySatelliteCount() {
		return 0;
	}
	
	public static int getVenusSatelliteCount() {
		return 0;
	}
	
	public static int getEarthSatelliteCount() {
		return 1;
	}
	
	public static int getMarsSatelliteCount() {
		return 2;
	}
	
	public static int getJupiterSatelliteCount() {
		return 79;
	}
	
	public static int getSaturnSatelliteCount() {
		return 82;
	}
	
	public static int getUranusSatelliteCount() {
		return 27;
	}
	
	public static int getNeptuneSatelliteCount() {
		return 14;
	}
	
	public static int getPlutoSatelliteCount() {
		return 5;
	}

}
