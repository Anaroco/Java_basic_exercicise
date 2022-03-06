package ejercicio1;

import java.util.Scanner; // se busca en la API de Java 

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // se crea un objeto

		System.out.println("Introduce tu nombre");
		String name_user = entrada.nextLine();

		System.out.println("Cuantos años tienes?");
		int age_user = entrada.nextInt();

		if (age_user >= 18) {
			System.out.println("Hola " + name_user + " tienes " + age_user + " puedes pasar");
		} else {
			System.out.println("Hola " + name_user + " tienes " + age_user + " no puedes pasar");
		}

		entrada.close();
	}
}

// public class ejercicio1 {

// public static void main(String[] args) {
// int a;
// //string b;

// Scanner S = new Scanner(System.in); //se crea un objeto

// System.out.println("Introduce tu edad por teclado:");
// a = S.nextInt();

// System.out.println("Tu edad es " +a);
// System.out.print("puedes pasar");

// }
// }

// package com.ejercicio1;

// /**
// * Hello world!
// */
// public final class App {
// private App() {
// }

// /**
// * Says hello to the world.
// * @param args The arguments of the program.
// */
// public static void main(String[] args) {
// System.out.println("Hello World!");
// }
// }
