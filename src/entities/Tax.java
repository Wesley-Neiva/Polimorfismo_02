package entities;

public abstract class Tax {
	private String name;
	private Double anualIncome;
	
	public Tax() {}

	public Tax(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double imposto();
	
	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", imposto());

	}
}
