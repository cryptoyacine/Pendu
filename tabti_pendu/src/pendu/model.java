package pendu;

import java.sql.Connection;

public class model {
	private int id;
	private String nom_p1;
	private String nom_p2;
	private String mot_p1;
	private String mot_p2;
	private String essai_p1;
	private String essai_p2;
	private Connection cnx;
	
	public Connection getCnx() {
		return cnx;
	}
	public void setCnx(Connection cnx) {
		this.cnx = cnx;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_p1() {
		return nom_p1;
	}
	@Override
	public String toString() {
		return "model [id=" + id + ", nom_p1=" + nom_p1 + ", nom_p2=" + nom_p2 + ", mot_p1=" + mot_p1 + ", mot_p2="
				+ mot_p2 + ", essai_p1=" + essai_p1 + ", essai_p2=" + essai_p2 + "]";
	}
	public void setNom_p1(String nom_p1) {
		this.nom_p1 = nom_p1;
	}
	public String getNom_p2() {
		return nom_p2;
	}
	public void setNom_p2(String nom_p2) {
		this.nom_p2 = nom_p2;
	}
	public String getMot_p1() {
		return mot_p1;
	}
	public void setMot_p1(String mot_p1) {
		this.mot_p1 = mot_p1;
	}
	public String getMot_p2() {
		return mot_p2;
	}
	public void setMot_p2(String mot_p2) {
		this.mot_p2 = mot_p2;
	}
	public String getEssai_p1() {
		return essai_p1;
	}
	public void setEssai_p1(String essai_p1) {
		this.essai_p1 = essai_p1;
	}
	public String getEssai_p2() {
		return essai_p2;
	}
	public void setEssai_p2(String essai_p2) {
		this.essai_p2 = essai_p2;
	}
}
