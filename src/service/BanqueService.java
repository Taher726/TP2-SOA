package service;
import java.util.List;

public class BanqueService {
	List<Compte> comptes;
	public double conversion(double montant) {
		return montant * 0.30;
	}
	public Compte getCompte(int index) {
		return comptes.get(index);
	}
	public List<Compte> getComptes(){
		return comptes;
	}
}
