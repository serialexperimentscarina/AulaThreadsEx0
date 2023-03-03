package controller;

public class ThreadVetor extends Thread{
	
	private int valor;
	private int[] vet;
	
	public ThreadVetor(int valor, int[] vet) {
		this.valor = valor;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		if (valor % 2 == 0) {
			par();
		} else {
			impar();
		}
	}

	private void par() {
		double tempoInicial = System.nanoTime();
		long soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		System.out.println("Tempo para percorrer vetor com for: " + tempoTotal + "s.");
	}
	
	private void impar() {
		double tempoInicial = System.nanoTime();
		long soma = 0;
		
		for (int i : vet) {
			soma += i;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		System.out.println("Tempo para percorrer vetor com foreach: " + tempoTotal + "s.");
	}

}
