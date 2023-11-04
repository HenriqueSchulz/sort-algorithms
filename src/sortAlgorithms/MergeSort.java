package sortAlgorithms;

public class MergeSort {
	
	private int iteracoes = 0;
	private int trocas = 0;
	
	public MergeSort(){}
	
	public int[] mergeSort(int[] vetor, int[] orderedVetor, int start, int end) {
		
		int middle = (start + end)/2;
		
		if(start < end) {
			
			//Separa Esquerda
			mergeSort(vetor, orderedVetor, start, middle);
			
			//Separa Direita
			mergeSort(vetor, orderedVetor, middle+1, end);	
			
			//Ordena
			order(vetor, orderedVetor, start, middle, end);
						
		}
		
		return vetor;
	}
	
	public int[] order(int[] vetor, int[] orderedVetor,int start, int middle, int end) {
		
		int topLeft = start;
		int topRight = middle + 1;
		
		for(int i = start; i <= end; i++) {
			iteracoes++;
			
			if(topLeft > middle) {
				orderedVetor[i] = vetor[topRight];
				topRight++;
				
			} else if (topRight > end) {
				orderedVetor[i] = vetor[topLeft];
				topLeft++;
				
			} else if(vetor[topLeft] < vetor[topRight]) {
				trocas++;
				orderedVetor[i] = vetor[topLeft];
				topLeft++;
				
			} else if(vetor[topRight] < vetor[topLeft]){
				trocas++;
				orderedVetor[i] = vetor[topRight];
				topRight++;
			}
		}
		
		for(int i = start; i <= end; i++) {
			vetor[i] = orderedVetor[i];
		}
		
		return vetor;
		
	}
	
	public int getIteracoes() {
		return iteracoes;
	}

	public int getTrocas() {
		return trocas;
	}
	
}
