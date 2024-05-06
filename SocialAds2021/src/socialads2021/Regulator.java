package socialads2021;

import java.util.ArrayList;
import java.util.List;

public class Regulator implements Observer{
	private List<String> foulTerms;
	private static Regulator instance;
	
	private Regulator() {
		foulTerms = new ArrayList<>();
		foulTerms.add("bad");
		foulTerms.add("appaling");
		foulTerms.add("ugly");
		foulTerms.add("useless");
		foulTerms.add("low quality");
	}
	
	public static Regulator getInstance() {
		if(instance == null) {
			instance = new Regulator();
		}
		
		return instance;
	}
	
	@Override
	public boolean update(Advertisement advertisement) {
		for(String foulTerm: foulTerms) {
			if(advertisement.getText().contains(foulTerm)) {
				System.out.println("Ad title: " + advertisement.getTitle());
				System.out.println("Ad text: " + advertisement.getText());
				System.out.println("Status: The Advertisement text contains " + "\"" + foulTerm + "\". This is a foul term.");
				System.out.println("Advertisement wil not be uploaded.\n");
				return false;
			}
		}
		return true;
	}

}
