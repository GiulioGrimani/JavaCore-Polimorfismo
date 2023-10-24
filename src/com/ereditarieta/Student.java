package com.ereditarieta;

import com.interfaccia.Studioso;

public class Student extends Person implements Studioso {

	private String passportNumber;

	public Student(String firstName, String lastName, int age, String passportNumber) {
		super(firstName, lastName, age);
		this.passportNumber = passportNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public void greeting() {
		System.out.println("Ciao sono uno studente");
	}

	/*
	 * Esempio di polimorfismo per metodi: faccio l'overloading del metodo study
	 * 
	 * (il commento su ogni metodo e' la firma del metodo)
	 */

	// study()
	@Override
	public void study() {
		System.out.println("ehhh ora studio");
	}

	// study(String)
	public void study(String materia) {
		System.out.println("ehh ora studio " + materia);
	}

	// study(int)
	public void study(int minuti) {
		System.out.println("ehh ora studio per " + minuti + " minuti");
	}

	@Override
	public void drinkCoffe() {
		System.out.println("ho bisogno di caffe' aiuto");
	}

}
