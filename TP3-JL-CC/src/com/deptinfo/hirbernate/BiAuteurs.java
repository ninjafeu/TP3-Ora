package com.deptinfo.hirbernate;

// Generated Dec 2, 2014 12:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BiAuteurs generated by hbm2java
 */
public class BiAuteurs implements java.io.Serializable {

	private int auteurId;
	private String nom;
	private String prenom;
	private String pays;
	private String siteInternet;
	private String anneeNaissance;
	private String anneeDeces;
	private Set biArticleses = new HashSet(0);

	public BiAuteurs() {
	}

	public BiAuteurs(int auteurId, String nom, String prenom, String pays,
			String anneeNaissance) {
		this.auteurId = auteurId;
		this.nom = nom;
		this.prenom = prenom;
		this.pays = pays;
		this.anneeNaissance = anneeNaissance;
	}

	public BiAuteurs(int auteurId, String nom, String prenom, String pays,
			String siteInternet, String anneeNaissance, String anneeDeces,
			Set biArticleses) {
		this.auteurId = auteurId;
		this.nom = nom;
		this.prenom = prenom;
		this.pays = pays;
		this.siteInternet = siteInternet;
		this.anneeNaissance = anneeNaissance;
		this.anneeDeces = anneeDeces;
		this.biArticleses = biArticleses;
	}

	public int getAuteurId() {
		return this.auteurId;
	}

	public void setAuteurId(int auteurId) {
		this.auteurId = auteurId;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getSiteInternet() {
		return this.siteInternet;
	}

	public void setSiteInternet(String siteInternet) {
		this.siteInternet = siteInternet;
	}

	public String getAnneeNaissance() {
		return this.anneeNaissance;
	}

	public void setAnneeNaissance(String anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public String getAnneeDeces() {
		return this.anneeDeces;
	}

	public void setAnneeDeces(String anneeDeces) {
		this.anneeDeces = anneeDeces;
	}

	public Set getBiArticleses() {
		return this.biArticleses;
	}

	public void setBiArticleses(Set biArticleses) {
		this.biArticleses = biArticleses;
	}

}
