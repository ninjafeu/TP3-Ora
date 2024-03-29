package com.deptinfo.hirbernate;

// Generated Dec 2, 2014 12:51:27 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * BiProvinces generated by hbm2java
 */
public class BiProvinces implements java.io.Serializable {

	private String provCode;
	private String provDescFr;
	private String provDescEn;
	private BigDecimal pcTaxeProv;
	private BigDecimal pcTaxeFed;
	private Set biMembreses = new HashSet(0);
	private Set biMaisonseditionses = new HashSet(0);

	public BiProvinces() {
	}

	public BiProvinces(String provCode, String provDescFr, String provDescEn,
			BigDecimal pcTaxeProv, BigDecimal pcTaxeFed) {
		this.provCode = provCode;
		this.provDescFr = provDescFr;
		this.provDescEn = provDescEn;
		this.pcTaxeProv = pcTaxeProv;
		this.pcTaxeFed = pcTaxeFed;
	}

	public BiProvinces(String provCode, String provDescFr, String provDescEn,
			BigDecimal pcTaxeProv, BigDecimal pcTaxeFed, Set biMembreses,
			Set biMaisonseditionses) {
		this.provCode = provCode;
		this.provDescFr = provDescFr;
		this.provDescEn = provDescEn;
		this.pcTaxeProv = pcTaxeProv;
		this.pcTaxeFed = pcTaxeFed;
		this.biMembreses = biMembreses;
		this.biMaisonseditionses = biMaisonseditionses;
	}

	public String getProvCode() {
		return this.provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}

	public String getProvDescFr() {
		return this.provDescFr;
	}

	public void setProvDescFr(String provDescFr) {
		this.provDescFr = provDescFr;
	}

	public String getProvDescEn() {
		return this.provDescEn;
	}

	public void setProvDescEn(String provDescEn) {
		this.provDescEn = provDescEn;
	}

	public BigDecimal getPcTaxeProv() {
		return this.pcTaxeProv;
	}

	public void setPcTaxeProv(BigDecimal pcTaxeProv) {
		this.pcTaxeProv = pcTaxeProv;
	}

	public BigDecimal getPcTaxeFed() {
		return this.pcTaxeFed;
	}

	public void setPcTaxeFed(BigDecimal pcTaxeFed) {
		this.pcTaxeFed = pcTaxeFed;
	}

	public Set getBiMembreses() {
		return this.biMembreses;
	}

	public void setBiMembreses(Set biMembreses) {
		this.biMembreses = biMembreses;
	}

	public Set getBiMaisonseditionses() {
		return this.biMaisonseditionses;
	}

	public void setBiMaisonseditionses(Set biMaisonseditionses) {
		this.biMaisonseditionses = biMaisonseditionses;
	}

}
