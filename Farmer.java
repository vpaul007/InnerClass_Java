package enums.simple;

public enum Farmer {
	DAIRY(200),
	BEEF(150),
	SHEEP(160);
	
	private int numAcres;

	Farmer(int numAcres) {
		this.numAcres = numAcres;
	}
	
	public int getNumAcres() {
		return numAcres;
	}

	public void setNumAcres(int numAcres) {
		this.numAcres = numAcres;
	}

	@Override
	public String toString() {
		final int DAIRY=0, BEEF=1, SHEEP=3;
		String s="";
		
		switch(this.ordinal()) {
		case DAIRY:
			s = " Dairy farmer";
			break;
		case BEEF:
			s = " Beef farmer";
			break;
		case SHEEP:
			s = " Sheep farmer";
			break;
		}
		
		
		return s + " and has" + numAcres + " acres";
	}
}
