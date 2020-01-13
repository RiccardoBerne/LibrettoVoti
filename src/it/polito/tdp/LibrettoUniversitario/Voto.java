package it.polito.tdp.LibrettoUniversitario;

import java.time.LocalDate;

public class Voto {
	private int Voto;
	private String Corso;
	private LocalDate Data;
	public Voto(int voto, String corso, LocalDate data) {
		super();
		Voto = voto;
		Corso = corso;
		Data = data;
	}
	public int getVoto() {
		return Voto;
	}
	public void setVoto(int voto) {
		Voto = voto;
	}
	public String getCorso() {
		return Corso;
	}
	public void setCorso(String corso) {
		Corso = corso;
	}
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}

	
}
