package br.pucrs.tablesearch;
import br.pucrs.sorts.Sorts;
import br.pucrs.util.ContagemRes;

public class AlgPesquisa {
	public ContagemRes directSearch( long [] vet, long valor ) {
		Sorts srt = new Sorts();
		double segundos;
		int res = -1, i;

		srt.setIteracoes(0);
		srt.initClock();
		for (i = 0; ((i < vet.length) && (vet[i] != valor)); i++)
			srt.incrIteracoes(1);

		if (i < vet.length)
			res = i;

		segundos = srt.getClockSec();
		ContagemRes sRes = new ContagemRes();
		sRes.setValueRes(res);
		sRes.setIteracoes(srt.getIteracoes());
		sRes.setTime(segundos);
		return sRes;   
	}
	
	public ContagemRes binarySearch( long [] tab, long value ) {
		int res = -1;
		int low = 0;
		int high = tab.length - 1;
		int middle;
		Sorts srt = new Sorts();
		double segundos;
		
		srt.setIteracoes(0);
		srt.initClock();
		while ( low <= high) {
			srt.incrIteracoes(1);
			
			middle = (high+low)/2;
			
			if ( tab[middle] > value )
				high = middle - 1;
			else if ( tab[middle] < value )  
				low = middle + 1;
			else{
				res = middle;
				break;
				}
		}
		segundos = srt.getClockSec();
		ContagemRes sRes = new ContagemRes();
		sRes.setValueRes(res);
		sRes.setIteracoes(srt.getIteracoes());
		sRes.setTime(segundos);
		return sRes;
	}
}
