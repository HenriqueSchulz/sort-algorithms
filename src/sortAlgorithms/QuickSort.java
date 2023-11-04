package sortAlgorithms;

public class QuickSort {
	
	private long iteracoes = 0;
	private long trocas = 0;
	
	public QuickSort(){}
	
	public int[] quickSort(int[] vetor, int inf, int sup) {
		
		int pivot;
		if(inf >= sup) {
			return vetor;
		}
		
		pivot = split(vetor, inf, sup);
		
		quickSort(vetor, inf, pivot-1);
		quickSort(vetor, pivot+1, sup);
		return vetor;
	}
	
	public int split(int[] vetor, int inf, int sup) {
		
		int indexZero = inf;
		int temp;
		
		while(inf <= sup) {
			iteracoes++;
			if(vetor[inf] <= vetor[indexZero]) {
				inf ++;
			}
			if(vetor[sup] > vetor[indexZero]) {
				sup--;
			}
			if(inf > sup) {
				trocas++;
				temp = vetor[indexZero];
				vetor[indexZero] = vetor[sup];
				vetor[sup] = temp; 
				return sup;
			}
			if(vetor[inf] > vetor[sup]) {
				trocas++;
				temp = vetor[sup];
				vetor[sup] = vetor[inf];
				vetor[inf] = temp; 
			}
		}
		
		return sup;
	}
	
	public long getIteracoes() {
		return iteracoes;
	}

	public long getTrocas() {
		return trocas;
	}
	
}
