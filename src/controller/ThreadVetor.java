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
		
	}
	
}
