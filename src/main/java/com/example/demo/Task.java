package com.example.demo;

import java.util.Date;

public class Task {

	private int identifiant;
	private String titre;
	private boolean encours;
	private Date dateDeCreation;
	
	public Task(int identifiant, String titre, boolean encours, Date dateDeCreation) {
		this.identifiant = identifiant;
		this.titre = titre;
		this.encours = encours;
		this.dateDeCreation = dateDeCreation;
		
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public boolean isEncours() {
		return encours;
	}

	public void setEncours(boolean encours) {
		this.encours = encours;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}


}
