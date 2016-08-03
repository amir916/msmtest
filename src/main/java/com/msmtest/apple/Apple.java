package com.msmtest.apple;

public class Apple {

	final private Colour colour;
	final private int weight;
	final private int taste;
	final private boolean hasWorm;

	private Status status;

	public Apple(Colour colour, int weight, int taste, boolean hasWorm) {
		this.hasWorm = hasWorm;

		if (isAValidColour(colour)) {
			this.colour = colour;
		} else {
			throw new IllegalArgumentException("Colour can't be NULL");
		}

		if (isWeightValid(weight)) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException(
					String.format(
							"Weight can only between 10 and 100. Illegal value %s was passed.",
							weight));
		}

		if (isTasteValid(taste)) {
			this.taste = taste;
		} else {
			throw new IllegalArgumentException(
					String.format(
							"Taste field can only contain 1, 2, 3, or 4. Illegal value %s was passed.",
							taste));
		}

		status = Status.PLUCKED;
	}

	private boolean isAValidColour(Colour colour) {
		if (colour == null) {
			return false;
		}
		return true;
	}

	private boolean isWeightValid(int weight) {
		if (weight < 10 || weight > 100) {
			return false;
		}
		return true;
	}

	private boolean isTasteValid(int taste) {
		if (taste < 1 || taste > 4) {
			return false;
		}
		return true;
	}

	public Colour getColour() {
		return colour;
	}

	public int getWeight() {
		return weight;
	}

	public int getTaste() {
		return taste;
	}

	public boolean hasWorm() {
		return hasWorm;
	}

	public void peel() {
		if(canPeel()){
			status = Status.PEELED;
		}else{
			throw new IllegalStateException(String.format("Appel can't be peeled. Taste = %s, hasWorm = %s.", taste, hasWorm));
		}		
	}

	private boolean canPeel() {
		return ((taste > 3) && !hasWorm);
	}

	public boolean isPeeled() {
		if (status.equals(Status.PEELED))
			return true;
		else
			return false;
	}

	public void eat() {
		if(!isPeeled()){
			peel();
		}
		status = Status.EATEN;
	}

	public boolean isEaten() {
		if (status.equals(Status.EATEN))
			return true;
		else
			return false;
	}
}
