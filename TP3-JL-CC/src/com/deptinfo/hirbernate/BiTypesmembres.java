package com.deptinfo.hirbernate;

// Generated Dec 2, 2014 12:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BiTypesmembres generated by hbm2java
 */
public class BiTypesmembres implements java.io.Serializable {

	private char typeMembre;
	private String typeDescFr;
	private String typeDescEn;
	private byte nbJoursSurEmprunt;
	private Set biMembreses = new HashSet(0);

	public BiTypesmembres() {
	}

	public BiTypesmembres(char typeMembre, String typeDescFr,
			String typeDescEn, byte nbJoursSurEmprunt) {
		this.typeMembre = typeMembre;
		this.typeDescFr = typeDescFr;
		this.typeDescEn = typeDescEn;
		this.nbJoursSurEmprunt = nbJoursSurEmprunt;
	}

	public BiTypesmembres(char typeMembre, String typeDescFr,
			String typeDescEn, byte nbJoursSurEmprunt, Set biMembreses) {
		this.typeMembre = typeMembre;
		this.typeDescFr = typeDescFr;
		this.typeDescEn = typeDescEn;
		this.nbJoursSurEmprunt = nbJoursSurEmprunt;
		this.biMembreses = biMembreses;
	}

	public char getTypeMembre() {
		return this.typeMembre;
	}

	public void setTypeMembre(char typeMembre) {
		this.typeMembre = typeMembre;
	}

	public String getTypeDescFr() {
		return this.typeDescFr;
	}

	public void setTypeDescFr(String typeDescFr) {
		this.typeDescFr = typeDescFr;
	}

	public String getTypeDescEn() {
		return this.typeDescEn;
	}

	public void setTypeDescEn(String typeDescEn) {
		this.typeDescEn = typeDescEn;
	}

	public byte getNbJoursSurEmprunt() {
		return this.nbJoursSurEmprunt;
	}

	public void setNbJoursSurEmprunt(byte nbJoursSurEmprunt) {
		this.nbJoursSurEmprunt = nbJoursSurEmprunt;
	}

	public Set getBiMembreses() {
		return this.biMembreses;
	}

	public void setBiMembreses(Set biMembreses) {
		this.biMembreses = biMembreses;
	}

}
