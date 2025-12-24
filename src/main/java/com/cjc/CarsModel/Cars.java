package com.cjc.CarsModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@XmlRootElement
@Table(name = "Cars_Details")
public class Cars {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer cno;
	private String cname;
	private Double cprice;
	
	public Cars() {
		super();
	}

	public Cars(Integer cno, String cname, Double cprice) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cprice = cprice;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCprice() {
		return cprice;
	}

	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Cars [cno=" + cno + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
	
	
	
	
	

}
