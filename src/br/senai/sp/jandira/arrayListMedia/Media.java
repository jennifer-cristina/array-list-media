package br.senai.sp.jandira.arrayListMedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	Scanner sc;
	ArrayList<Double> arrNota = new ArrayList<Double>();
	
	double soma;
	double media;
	int contNota;
	
	public Media() {
		
		sc = new Scanner(System.in);
		
		/*arrNota.add(10.0);
		arrNota.add(5.5);
		arrNota.add(8.5);
		arrNota.add(2.5);*/
		
	}
	
	public void receberNotas() {
		
		System.out.println("Digite uma nota ou ou -1 para encerrar ");

		double nota = sc.nextDouble();
		
		while (nota >= 0) {
			
			arrNota.add(nota);
			System.out.println("Digite uma nota ou ou -1 para encerrar ");
			nota = sc.nextDouble();
			contNota++;
				
		}
		
	}
	
	public void exibirNota() {
		
		for (int i = 0; i < arrNota.size(); i++) {
			
			System.out.println("Nota " + (i + 1) + " = " + arrNota.get(i));
			
		}
	}
	
	public double calcularMedia() {
	
		arrNota.forEach(nota->{
			
			soma += nota;
			
		});
		
		media = soma / contNota;
		System.out.println();
		return media;
	}
	
}
