package juego;

import javax.swing.JOptionPane;

public class Adivinar {
	public static void main(String[] args) {
		int numero, aleatorio, contador = 0;
		
		aleatorio = (int)(Math.random()*100);
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
			if(aleatorio > numero) {
				System.out.println("Digite un numero mayor");
			}else {
				System.out.println("Digite un numero menor");
			}
			contador++;
		}while(numero != aleatorio);
		
		System.out.println("Has adivinado el numero, chaval :V");
		System.out.println("Te ha llevado "+contador+" intentos");
	}
}
