package com.msmtest.apple;

public class Peeler {

	final private PeelerType type;

	public Peeler(PeelerType type) {
		this.type = type;
	}

	public void peel(Apple apple) {
		if (canPeel(apple)) {
			apple.peel();
		}
	}

	private boolean canPeel(Apple apple) {
		if (isValyrianPeeler() || isNormalPeelerPeelingGreenOrRedApple(apple))
			return true;
		else
			return false;
	}

	private boolean isValyrianPeeler() {
		return type.equals(PeelerType.VALYRIAN);
	}

	private boolean isNormalPeelerPeelingGreenOrRedApple(Apple apple) {
		return type.equals(PeelerType.NORMAL) && (apple.getColour().equals(Colour.RED) || apple.getColour().equals(Colour.GREEN));
	}
}
