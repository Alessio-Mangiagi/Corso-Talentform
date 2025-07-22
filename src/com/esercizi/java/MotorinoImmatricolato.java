package com.esercizi.java;
public class MotorinoImmatricolato extends Motorino{
public float maxVelocità;
public String targa;

public MotorinoImmatricolato(String colore, float velocità, String tipo, boolean antifurto, float maxVelocità, String targa) {
	super(colore, velocità, tipo, antifurto);
	// TODO Auto-generated constructor stub
	this.maxVelocità = maxVelocità;
	this.targa = targa;
}



public float getMaxVelocità() {
	return maxVelocità;
}



public void setMaxVelocità(float maxVelocità) {
	this.maxVelocità = maxVelocità;
}



public void stampaMaxVelocità() {
	System.out.println("Velocità Max: " + getMaxVelocità());
}



@Override
public void accelera(float velocità) {		

//	if(!antifurto) {
//		this.velocità += velocità;
//		System.out.println("Il motorino ha velocità: " + this.velocità);
//	}

	float s = getVelocità() + velocità;
	
	if(s < getMaxVelocità()) {
		setVelocità(s);
	} else {
		setVelocità(getMaxVelocità());
	}

}



@Override
public String toString() {
	return "Motorino [colore=" + colore + ", velocità=" + velocità + ", tipo=" + tipo + ", antifurto=" + antifurto + ", maxVelocità=" + maxVelocità + ", targa=" + targa + "]";
}



public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}