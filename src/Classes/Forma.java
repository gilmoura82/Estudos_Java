package Classes;

import Classes.enums.Color;

public abstract class Forma {

	private Color color;
	
	public Forma() {	
	}

	public Forma(Color color) {
		this.color = color;
	}

	public Color getCor() {
		return color;
	}

	public void setCor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
