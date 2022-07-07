package com.cg.ofr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tenant")
public class Tenant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int tenant_id;
	private int age;
	
	@OneToOne
	private FlatAddress taddress;
	
	
	public Tenant() {}
	public Tenant(int tenant_id, int age, FlatAddress taddress) {
		super();
		this.tenant_id = tenant_id;
		this.age = age;
		this.taddress = taddress;
	}
	public int getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(int tenant_id) {
		this.tenant_id = tenant_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FlatAddress getTaddress() {
		return taddress;
	}
	public void setTaddress(FlatAddress taddress) {
		this.taddress = taddress;
	}
	@Override
	public String toString() {
		return "Tenant [tenant_id=" + tenant_id + ", age=" + age + ", taddress=" + taddress + "]";
	}
	
	

}
