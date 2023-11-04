package sortAlgorithms;

public class InsertionSort {
	
	private int iteracoes = 0;
	private int trocas = 0;
	
	public InsertionSort(){}
	
	public int[] insertionSort(int vetor [], int size) {
		for (int i = 1; i < size; i ++) {
			iteracoes++;
			
			int actual_num = vetor[i]; //segundo elemento da vetor
			int next_num = i - 1; //elemento anterior
			
			while (next_num >= 0 && vetor[next_num] > actual_num) {
				trocas++;
				vetor[next_num + 1] = vetor[next_num];
				next_num = next_num -1;
				vetor[next_num + 1] = actual_num;
				
			}
		
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
