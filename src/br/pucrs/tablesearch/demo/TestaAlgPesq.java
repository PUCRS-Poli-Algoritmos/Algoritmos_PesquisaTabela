package br.pucrs.tablesearch.demo;

import br.pucrs.sorts.Sorts;
import br.pucrs.tablesearch.AlgPesquisa;
import br.pucrs.util.ContagemRes;

public class TestaAlgPesq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContagemRes sRes;
		Sorts srt = new Sorts();
		AlgPesquisa pesq = new AlgPesquisa();
		long [] vet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println("Vetor de 10 posições (valores de 0 até 9) - Pesquisa Direta");
		for (int i = 0; i < vet.length; i++){
			sRes = pesq.directSearch(vet, i);
			System.out.println("Procura " + i + " -> " + sRes.getValueRes());
			System.out.println("Nro de Iteracoes: " + sRes.getIteracoes()); 
		}
		
		System.out.println("\nVetor de 10 posições (valores de 0 até 9) - Pesquisa Binária");
		for (int i = 0; i < vet.length; i++){
			sRes = pesq.binarySearch(vet, i);
			System.out.println("Procura " + i + " -> " + sRes.getValueRes());
			System.out.println("Nro de Iteracoes: " + sRes.getIteracoes()); 
		}
		
		sRes = pesq.directSearch(vet, -10);
		System.out.println("\nVetor de 10 posições (valores de 0 até 9) - Procura -10 - Pesquisa Direta -> " + sRes.getValueRes());
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		sRes = pesq.binarySearch(vet, -10);
		System.out.println("\nVetor de 10 posições (valores de 0 até 9) - Procura -10 - Pesquisa Binária -> " + sRes.getValueRes());
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		
		sRes = pesq.directSearch(vet, 2000);
		System.out.println("\nVetor de 10 posições (valores de 0 até 9) - Procura 2000 - Pesquisa Direta -> " + sRes.getValueRes());
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		sRes = pesq.binarySearch(vet, 2000);
		System.out.println("\nVetor de 10 posições (valores de 0 até 9) - Procura 2000 - Pesquisa Binária -> " + sRes.getValueRes());
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("\n\nExecução nro " + (i+1));
//
//			vet = srt.geraVetor(1000000, 1200000);		
//
//			sRes = pesq.directSearch(vet, 50000);
//			System.out.println("\nProcura 50000 - Pesquisa Direta -> " + sRes.getValueRes());
//			if (sRes.getValueRes() != -1)
//				System.out.println("Valor na posição: " + vet[sRes.getValueRes()]);
//			else
//				System.out.println("Não encontrou!");
//			System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
//			System.out.println("Tempo em segundos: " + sRes.getTime());
//
//			vet = srt.heapSort(vet).getVet();
//			sRes = pesq.binarySearch(vet, 50000);
//			System.out.println("\nProcura 50000 - Pesquisa Binária -> " + sRes.getValueRes());
//			if (sRes.getValueRes() != -1)
//				System.out.println("Valor na posição: " + vet[sRes.getValueRes()]);
//			else
//				System.out.println("Não encontrou!");
//			System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
//			System.out.println("Tempo em segundos: " + sRes.getTime());
//		}
//	
//		sRes = pesq.binarySearch(vet, -13);
//		System.out.println("\nProcura -13 ->" + sRes.getValueRes());
//		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());

		System.out.println("\n\nPrimeira execução com vetor aleatório:");

		vet = srt.geraVetor(10000, 12000);		

		sRes = pesq.directSearch(vet, 50000);
		System.out.println("\nVetor de 10000 elementos - Procura 50000 - Pesquisa Direta -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

		vet = srt.heapSort(vet).getResult();
		sRes = pesq.binarySearch(vet, 50000);
		System.out.println("\nVetor de 10000 elementos - Procura 50000 - Pesquisa Binária -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

		System.out.println("\n\nSegunda execução com vetor aleatório");
		vet = srt.geraVetor(100000, 12000);		
		sRes = pesq.directSearch(vet, 50000);
		System.out.println("\nVetor de 100000 elementos - Procura 50000 - Pesquisa Direta -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

		vet = srt.heapSort(vet).getResult();
		sRes = pesq.binarySearch(vet, 50000);
		System.out.println("\nVetor de 100000 elementos - Procura 50000 - Pesquisa Binária -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

		System.out.println("\n\nTerceira execução com vetor aleatório");
		vet = srt.geraVetor(10000000, 12000);		
		sRes = pesq.directSearch(vet, 50000);
		System.out.println("\nVetor de 10000000 elementos - Procura 50000 - Pesquisa Direta -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

		vet = srt.heapSort(vet).getResult();
		sRes = pesq.binarySearch(vet, 50000);
		System.out.println("\nVetor de 10000000 elementos - Procura 50000 - Pesquisa Binária -> " + sRes.getValueRes());
		if (sRes.getValueRes() != -1)
			System.out.println("Valor na posição: " + vet[(int) sRes.getValueRes()]);
		else
			System.out.println("Não encontrou!");
		System.out.println("Nro de Iteracoes: " + sRes.getIteracoes());
		System.out.println("Tempo em segundos: " + sRes.getTime());

	}

}
