package com.colinaardsma.tfbps.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.colinaardsma.tfbps.models.util.SGPMultCalc;


@Entity
@Table(name = "fpprojb")
public class FPProjBatter extends AbstractEntity {
	
	private String name;
	private String team;
	private String pos;
	private int ab;
	private int r;
	private int hr;
	private int rbi;
	private int sb;
	private double avg;
	private double obp;
	private int h;
	private int dbl;
	private int tpl;
	private int bb;
	private int k;
	private double slg;
	private double ops;
	private double rSGP;
	private double hrSGP;
	private double rbiSGP;
	private double sbSGP;
	private double opsSGP;
	private double sgp;
	private String category;
	private Date created;

	public FPProjBatter(String name, String team, String pos, int ab, int r, int hr, int rbi, int sb, double avg, double obp, int h, int dbl, int tpl, int bb, int k, double slg, double ops, String category) {
		this.name = name;
		this.team = team;
		this.pos = pos;
		this.ab = ab;
		this.r = r;
		this.hr = hr;
		this.rbi = rbi;
		this.sb = sb;
		this.avg = avg;
		this.obp = obp;
		this.h = h;
		this.dbl = dbl;
		this.tpl = tpl;
		this.bb = bb;
		this.k = k;
		this.slg = slg;
		this.ops = ops;
		calcSgp(SGPMultCalc.sgpMultR(), SGPMultCalc.sgpMultHR(), SGPMultCalc.sgpMultRBI(), SGPMultCalc.sgpMultSB(), SGPMultCalc.sgpMultOPS());

		this.category = category;
		this.created = new Date();		
	}
	
	public FPProjBatter() {}
	
    @NotNull
    @Column(name = "name")
	public String getName() {
		return name;
	}

    protected void setName(String name) {
		this.name = name;
	}

    @NotNull
    @Column(name = "team")
	public String getTeam() {
		return team;
	}

    protected void setTeam(String team) {
		this.team = team;
	}

    @NotNull
    @Column(name = "pos")
	public String getPos() {
		return pos;
	}

    protected void setPos(String pos) {
		this.pos = pos;
	}

    @NotNull
    @Column(name = "ab")
	public int getAb() {
		return ab;
	}

    protected void setAb(int ab) {
		this.ab = ab;
	}

    @NotNull
    @Column(name = "r")
	public int getR() {
		return r;
	}

    protected void setR(int r) {
		this.r = r;
	}

    @NotNull
    @Column(name = "hr")
	public int getHr() {
		return hr;
	}

    protected void setHr(int hr) {
		this.hr = hr;
	}

    @NotNull
    @Column(name = "rbi")
	public int getRbi() {
		return rbi;
	}

    protected void setRbi(int rbi) {
		this.rbi = rbi;
	}

    @NotNull
    @Column(name = "sb")
	public int getSb() {
		return sb;
	}

    protected void setSb(int sb) {
		this.sb = sb;
	}

    @NotNull
    @Column(name = "avg")
	public double getAvg() {
		return avg;
	}

    protected void setAvg(double avg) {
		this.avg = avg;
	}

    @NotNull
    @Column(name = "obp")
	public double getObp() {
		return obp;
	}

    protected void setObp(double obp) {
		this.obp = obp;
	}

    @NotNull
    @Column(name = "h")
	public int getH() {
		return h;
	}

    protected void setH(int h) {
		this.h = h;
	}

    @NotNull
    @Column(name = "dbl")
	public int getDbl() {
		return dbl;
	}

    protected void setDbl(int dbl) {
		this.dbl = dbl;
	}

    @NotNull
    @Column(name = "tpl")
	public int getTpl() {
		return tpl;
	}

    protected void setTpl(int tpl) {
		this.tpl = tpl;
	}

    @NotNull
    @Column(name = "bb")
	public int getBb() {
		return bb;
	}

    protected void setBb(int bb) {
		this.bb = bb;
	}

    @NotNull
    @Column(name = "k")
	public int getK() {
		return k;
	}

    protected void setK(int k) {
		this.k = k;
	}

    @NotNull
    @Column(name = "slg")
	public double getSlg() {
		return slg;
	}

    protected void setSlg(double slg) {
		this.slg = slg;
	}

    @NotNull
    @Column(name = "ops")
	public double getOps() {
		return ops;
	}

    protected void setOps(double ops) {
		this.ops = ops;
	}

	@NotNull
    @Column(name = "rsgp")
	public double getRSGP() {
		return rSGP;
	}

	public void setRSGP(double rSGP) {
		this.rSGP = rSGP;
	}

	@NotNull
    @Column(name = "hrsgp")
	public double getHrSGP() {
		return hrSGP;
	}

	public void setHrSGP(double hrSGP) {
		this.hrSGP = hrSGP;
	}

	@NotNull
    @Column(name = "rbisgp")
	public double getRbiSGP() {
		return rbiSGP;
	}

	public void setRbiSGP(double rbiSGP) {
		this.rbiSGP = rbiSGP;
	}

	@NotNull
    @Column(name = "sbsgp")
	public double getSbSGP() {
		return sbSGP;
	}

	public void setSbSGP(double sbSGP) {
		this.sbSGP = sbSGP;
	}

	@NotNull
    @Column(name = "opssgp")
	public double getOpsSGP() {
		return opsSGP;
	}

	public void setOpsSGP(double opsSGP) {
		this.opsSGP = opsSGP;
	}

    @NotNull
    @Column(name = "sgp")
	public double getSgp() {
		return sgp;
	}

    protected void setSgp(double sgp) {
    	this.sgp = sgp;
    }

    @NotNull
    @Column(name = "category")
	public String getCategory() {
		return category;
	}

    protected void setCategory(String category) {
		this.category = category;
	}

	@NotNull
	@Column(name = "created")
	public Date getCreated() {
		return created;
	}
	
	@SuppressWarnings("unused")
	private void setCreated(Date created) {
		this.created = created;
	}
	
    protected void calcSgp(double sgpMultR, double sgpMultHR, double sgpMultRBI, double sgpMultSB, double sgpMultOPS) {
    	this.rSGP = this.r / sgpMultR;
    	this.hrSGP = this.hr / sgpMultHR;
    	this.rbiSGP = this.rbi / sgpMultRBI;
    	this.sbSGP = this.sb / sgpMultSB;
    	this.opsSGP = ((((((this.obp * ((double) this.ab * 1.15)) + 2178.8) / (((double) this.ab * 1.15) + 6682.0)) + (((this.slg * this.ab) + 2528.5) / ((double) this.ab + 5993.0))) - 0.748) / sgpMultOPS);
    			
    	this.sgp = this.rSGP + this.hrSGP + this.rbiSGP + this.sbSGP + this.opsSGP;
	}
    
}
