package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int[] vet = new int [1000];
		Random random = new Random ();
		int tam = vet.length;
		for (int i=0 ; i <tam ;  i++) {
			vet[i] = random.nextInt(100) + 1;
		}
		
		ThreadVetor thread1 = new ThreadVetor(1, vet);
		ThreadVetor thread2 = new ThreadVetor(2, vet);
		
		Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
		
		t1.start();
		t2.start();
		
		
	}

}
