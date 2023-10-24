package com.main;

import com.ereditarieta.Person;
import com.ereditarieta.Student;
import com.interfaccia.Studioso;

public class Main {

	public static void main(String[] args) {

		/*
		 * Concetto di ereditarieta': Student eredita i membri di Person
		 */

		Person p = new Person("Giulio", "Grimani", 21);

		System.out.println("Invoco il metodo greeting() su un oggetto di tipo Person");
		p.greeting();

		Student s = new Student("Ciccio", "Sballo", 54, "sdghgjksl");

		System.out.println("Invoco il metodo greeting() su un oggetto di tipo Student");
		s.greeting();

		/*
		 * Polimorfismo per metodi, ovvero overload: vedi classe Student.
		 * Sostanzialmente, scrivo versioni diverse per un determinato metodo usando
		 * firme diverse. Quindi il nome del metodo e' uguale, ma i parametri in input
		 * son diversi (firme diverse)
		 */
		s.study();
		s.study("Programmazione");
		s.study(120);

		/*
		 * Polimorfismo per oggetto: la reference dell'oggetto e' di tipo Person
		 * (superclasse) mentre l'oggetto e' di tipo Student (classe derivata o
		 * sottoclasse)
		 */
		Person io = new Student("Giulio", "Grimani", 32, "434523");

		/*
		 * Loose Coupling
		 */

		Studioso tu = new Student("Ciccio", "Palla", 43, "dgsgs");

		// Non vedo come e' fatta l'implementazione del metodo study
		// perche' sto PROGRAMMANDO PER INTERFACCIA: la reference e' di tipo
		// interfaccia ("tu" e' di tipo Studioso) e l'oggetto e' di tipo Student
		tu.study();

	}

}
