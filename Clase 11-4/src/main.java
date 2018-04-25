import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class main {

	public static void main(String[] args) {

		
		int i = 0;

		ArrayList<Integer> ListaEnteros;
		ListaEnteros = new ArrayList<Integer>();

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));

		while (numero != 0) {
			ListaEnteros.add(numero);

			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		}
		
		calculodePromedio(ListaEnteros);

		ordenarListaAscendente(ListaEnteros);
		
		calculodeMediana (ListaEnteros);
		
		calculodeCuadriles(ListaEnteros);
		
		//for (Integer n : ListaEnteros) {
		//	System.out.println(n);
		//}

		System.out.println("tamaño: " + ListaEnteros.size());

		float indiceMediana = (float) (ListaEnteros.size() / 2.0);

		//System.out.println("posición central: " + indiceMediana);

		System.out.println("posición en " + indiceMediana + ": " + ListaEnteros.get((int) indiceMediana));

		
		float PrimerCuartil=0;
		float TercerCuartil=0;
		
		
		if (ListaEnteros.size() % 4 == 0) {
			int valorMedioAux = ListaEnteros.size() / 4;
			PrimerCuartil = (float)(ListaEnteros.get(valorMedioAux) + ListaEnteros.get(valorMedioAux - 1) ) / 2; 
		}
		else {
			int valorMedioAux = (ListaEnteros.size() / 4)*3;
			TercerCuartil = ListaEnteros.get(valorMedioAux);
		}
		
		float restaCuartil=PrimerCuartil-TercerCuartil;
		
		
		System.out.println("La mediana del primer cuartil: " + PrimerCuartil);
		System.out.println("La mediana del tercer cuartil: " + TercerCuartil);
		
		System.out.println("La distancia entre cuartiles es: "+restaCuartil);

			
	}

	private static void ordenarListaAscendente(ArrayList<Integer> listaOrdenada) {
		System.out.println("Ordenando lista de forma Ascendente");

		int tmp;

		for (int i = 0; i < listaOrdenada.size() - 1; i++) {
			for (int j = i; j < listaOrdenada.size(); j++) {
				if (listaOrdenada.get(j) < listaOrdenada.get(i)) {
					tmp = listaOrdenada.get(i);
					listaOrdenada.set(i, listaOrdenada.get(j));
					listaOrdenada.set(j, tmp);
				}
			}
		}
		
	}
	private static void calculodePromedio (ArrayList<Integer> Lista ) {
		float promedio=0;
		int suma=0;
		for (Integer vita : Lista) {

			suma = suma + vita;
			promedio = suma / Lista.size();

		}
		
		System.out.println("El promedio es " + promedio);
		
		
	}
	
	private static void calculodeMediana (ArrayList<Integer> Lista) {
		float valorMediana;
		if (Lista.size() % 2 == 0) {
			int valorMedioAux = Lista.size() / 2;
			valorMediana = (float)(Lista.get(valorMedioAux) + Lista.get(valorMedioAux - 1) ) / 2; 
		}
		else {
			int valorMedioAux = Lista.size() / 2;
			valorMediana = Lista.get(valorMedioAux);
		}
		System.out.println("Valor de la Mediana: " + valorMediana);
		
	}
	

	private static void calculodeCuadriles (ArrayList<Integer> Lista) {
		float PrimerCuartil=0;
		float TercerCuartil=0;
		
		
		if (Lista.size() % 4 == 0) {
			int valorMedioAux = Lista.size() / 4;
			PrimerCuartil = (float)(Lista.get(valorMedioAux) + Lista.get(valorMedioAux - 1) ) / 2; 
		}
		else {
			int valorMedioAux = (Lista.size() / 4)*3;
			TercerCuartil = Lista.get(valorMedioAux);
		}
		
		float restaCuartil=PrimerCuartil-TercerCuartil;
		
		
		System.out.println("La mediana del primer cuartil: " + PrimerCuartil);
		System.out.println("La mediana del tercer cuartil: " + TercerCuartil);
		
		System.out.println("La distancia entre cuartiles es: "+restaCuartil);
	}
	}


