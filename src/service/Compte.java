package service;

public class Compte {
	private int code;
	private int solde;
	private String dateCreation;
	public Compte(int code, int solde, String dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public int getCode() {
		return this.code;
	}
	public int getSolde() {
		return this.solde;
	}
	public String getDateCreation() {
		return this.dateCreation;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
}
