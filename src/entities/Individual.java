package entities;

public class Individual extends Tax {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double imposto() {
		double taxa = 0.0;
		if(getAnualIncome() <= 20000.00) {
			taxa = getAnualIncome() * 0.15;
		}else {
			taxa = getAnualIncome() * 0.25;
			
		}
		if(healthExpenditures > 0) {
			taxa = taxa - healthExpenditures * 0.50;
		}
		return taxa;
	}

}
