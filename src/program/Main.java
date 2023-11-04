package program;

import java.util.Random;

import sortAlgorithms.BubbleSort;
import sortAlgorithms.InsertionSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.QuickSort;

public class Main {

	public static void main(String[] args) {
		
		gerarRelatorio(50);
		gerarRelatorio(500);
		gerarRelatorio(1000);
		gerarRelatorio(5000);
		gerarRelatorio(10000);
		
	}
	
	public static void printVetor(int[] vetor) {
		
		for(int x : vetor) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
	
	public static void gerarRelatorio(int x) {
		
		int[] bubbleVetor = new int[x];
		
		int[] insertionVetor = new int[x];
		
		int[] mergeVetor = new int[x];
		int[] orderedVetor = new int[x];
		
		int[] quickVetor = new int[x];
		
		Random random = new Random();
		for(int i = 0; i < x; i++) {
			int numeroAleatorio = random.nextInt();
			bubbleVetor[i] = numeroAleatorio;
			insertionVetor[i] = numeroAleatorio;
			mergeVetor[i] = numeroAleatorio;
			quickVetor[i] = numeroAleatorio;
		}
		
		System.out.println("==================================="+ x +"======================================");
		
		//Bubble Sort
		long startTimeBubbleSort = System.currentTimeMillis();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(bubbleVetor, x);
		long endTimeBubbleSort = System.currentTimeMillis();
		long executionTime = endTimeBubbleSort - startTimeBubbleSort;
		System.out.println("Tempo de execucao BubbleSort: " + executionTime + " milissegundos");
		System.out.println("Trocas: " + bubbleSort.getTrocas());
		System.out.println("Iteracoes: " + bubbleSort.getIteracoes());
		
		
		System.out.println();
		
		//Insertion Sort
		long startTimeInsertionSort = System.currentTimeMillis();
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(insertionVetor, x);
		long endTimeInsertionSort = System.currentTimeMillis();
		long executionTimeInsertionSort = endTimeInsertionSort - startTimeInsertionSort;
		System.out.println("Tempo de execucao InsertionSort: " + executionTimeInsertionSort + " milissegundos");
		System.out.println("Trocas: " + insertionSort.getTrocas());
		System.out.println("Iteracoes: " + insertionSort.getIteracoes());
		
		
		System.out.println();
		
		long startTimeMergeSort = System.currentTimeMillis();
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(mergeVetor, orderedVetor, 0, x -1);
		long endTimeMergeSort = System.currentTimeMillis();
		long executionTimeMergeSort = endTimeMergeSort - startTimeMergeSort;
		System.out.println("Tempo de execucao MergeSort: " + executionTimeMergeSort + " milissegundos");
		System.out.println("Trocas: " + mergeSort.getTrocas());
		System.out.println("Iteracoes: " + mergeSort.getIteracoes());
		
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(quickVetor, 0, x -1);
		long endTime = System.currentTimeMillis();
		long executionTimeQuick = endTime - startTime;
		System.out.println("Tempo de execucao QuickSort: " + executionTimeQuick + " milissegundos");
		System.out.println("Trocas: " + quickSort.getTrocas());
		System.out.println("Iteracoes: " + quickSort.getIteracoes());
		
		System.out.println("==========================================================================");
		
	}
	
}


