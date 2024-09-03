package controller;

public class ThreadVetor implements Runnable{
	private int num;
	private int[] vet;

	public ThreadVetor (int num, int [] vet) {
		this.num = num;
		this.vet = vet;
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
		
		if(num % 2 == 0) {
			for (int i = 0; i < vet.length; i++) {
							
		}
			}
		else {
			
			for (int valor:vet) {

			}
		}
		
		long finalTime = System.nanoTime();
		double timeMilSecond = (finalTime - startTime) / 1_000_000.0;
		System.out.println(finalTime);
		System.out.println("Número:"+ num + " -- Tempo "+ timeMilSecond + " milissegundos");
	}
	
}

