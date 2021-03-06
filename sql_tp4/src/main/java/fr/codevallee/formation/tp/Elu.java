package fr.codevallee.formation.tp;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Elu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
		
	@Column(length=40)
	private String nom;

	@ManyToMany
	private Set<Projet> projets;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
