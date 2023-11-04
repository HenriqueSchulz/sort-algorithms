package sortAlgorithms;

public class BubbleSort {
	
	private int iteracoes = 0;
	private int trocas = 0;
	
	public BubbleSort(){}
	
    public int[] bubbleSort(int vetor[], int size) {
    	
        int temp = 0;
        for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				iteracoes++;
				
                if (vetor[j - 1] > vetor[j]) {
                	
                    // Troca os elementos
                	trocas++;
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                }
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
