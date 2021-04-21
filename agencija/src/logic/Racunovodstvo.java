package logic;

import java.util.List;

import model.Zaposleni;

public class Racunovodstvo {
	
	public static double racunajTroskoveZarade (List<Zaposleni> listaZaposleni) {
		
		double zbirPlata = 0;
		
		    for(Zaposleni z: listaZaposleni) {
		    	
		    	zbirPlata += z.getPlata();
		    }
		
		return zbirPlata;
	}
	
	public static double racunajBonuse(List<Zaposleni> listaZaposleni) {
		
		double zbirBonusa = 0;
		for(Zaposleni z: listaZaposleni) {
			if(z.isBonus()) {
				zbirBonusa += z.getPlata()* 30/100;
			}
		}
		
	 return zbirBonusa;
		}
	
	public static double racunajPDV(double zarade, double bonusi) {
		
		return (zarade + bonusi)* 20/100;
	}
	
	
	
	

}
