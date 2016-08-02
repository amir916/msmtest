package com.msmtest.apple;

public class Apple {

	final private Colour colour;
	final private int weight;
	final private int taste;
	final private boolean hasWorm;
	
	public Apple(Colour colour, int weight, int taste, boolean hasWorm) {
		this.colour = colour;		
		this.hasWorm = hasWorm;
		
		if(isWeightValid(weight)){
			this.weight = weight;
		}else{
			throw new IllegalArgumentException(String.format("Weight can only between 10 and 100. Illegal value %s was passed.", weight));
		}		
		
		if(isTasteValid(taste)){
			this.taste = taste;
		}else{
			throw new IllegalArgumentException(String.format("Taste field can only contain 1, 2, 3, or 4. Illegal value %s was passed.", taste));
		}
	}

	private boolean isWeightValid(int weight) {
		if(weight < 10 || weight > 100){
			return false;
		}
		return true;
	}

	private boolean isTasteValid(int taste) {
		if(taste < 1 || taste > 4){
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
}
