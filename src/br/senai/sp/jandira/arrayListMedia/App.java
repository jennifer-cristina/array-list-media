package br.senai.sp.jandira.arrayListMedia;

public class App {

	public static void main(String[] args) {
		
		Media objMedia = new Media();
		
		objMedia.receberNotas();
		objMedia.exibirNota();
		System.out.println("M�dia Final: " + objMedia.calcularMedia());
		
	}

}
