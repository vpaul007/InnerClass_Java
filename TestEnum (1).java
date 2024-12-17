package enums.simple;

public class TestEnum {

	public static void main(String[] args) {
		enums();
	

	}

	private static void enums() {
		
		Farmer john = Farmer.BEEF;
		john.setNumAcres(500);
		double grant = calculateGrant(john);
		
		System.out.println("John is a " + john);
		System.out.println("John's grant is " + grant);
		
	}

	private static double calculateGrant(Farmer farmer) {
		
		double grant = 0.0;
		switch(farmer) {
		case BEEF:
			grant = farmer.getNumAcres() <200 ? 200*farmer.getNumAcres()
					: 50 * farmer.getNumAcres();
			break;
		case DAIRY:
			grant = farmer.getNumAcres() <200 ? 300*farmer.getNumAcres()
					: 80 * farmer.getNumAcres();
			break;
		case SHEEP:
			grant = farmer.getNumAcres() <200 ? 150*farmer.getNumAcres()
					: 40 * farmer.getNumAcres();
			break;
		}
		
		return grant;
	}

}
