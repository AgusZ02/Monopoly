package edu.ncsu.monopoly;

import java.util.Random;

public class Die {
	Random random = new Random(getRoll());
	public int getRoll() {
		return (int)(random.nextInt() * 6) + 1;
	}
}
