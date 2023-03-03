package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			vet[i] = (int) (Math.random() * 101);
		}
		
		Thread threadVet1 = new ThreadVetor(1, vet);
		Thread threadVet2 = new ThreadVetor(2, vet);
		threadVet1.start();
		threadVet2.start();
	}

}
