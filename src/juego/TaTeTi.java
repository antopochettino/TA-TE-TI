package juego;

import java.util.Scanner;

public class TaTeTi {

	public static void main(String[] args) {
		int coordenadaFila, coordenadaColumna;
		String[][] tablero = { { "___", "___", "___" }, { "___", "___", "___" }, { "___", "___", "___" } };
		reglasDelJuego();
		System.out.println("Jugador 1 - ingrese las coordenadas donde desea colocar la ficha:");
		Scanner sc = new Scanner(System.in);
		coordenadaFila = sc.nextInt();
		coordenadaColumna = sc.nextInt();
		while (tablero[0][0] != tablero[0][2] && tablero[1][0] != tablero[1][2] && tablero[2][0] != tablero[2][2]
				&& tablero[0][0] != tablero[2][0] && tablero[0][1] != tablero[2][1] && tablero[0][2] != tablero[2][2]
				&& tablero[0][0] != tablero[2][2] && tablero[0][2] != tablero[2][0]) {
			if (tablero[coordenadaFila][coordenadaColumna] == "___") {
				tablero[coordenadaFila][coordenadaColumna] = " X ";
				System.out.println(tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
				System.out.println(tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
				System.out.println(tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
			} else {
				System.out.println("Ya hay una ficha en esas coordenadas");
			}
			{
			}
			System.out.println("Jugador 2 - ingrese las coordenadas donde desea colocar la ficha:");
			coordenadaFila = sc.nextInt();
			coordenadaColumna = sc.nextInt();
			if (tablero[coordenadaFila][coordenadaColumna] == "___") {
				tablero[coordenadaFila][coordenadaColumna] = " O ";
				System.out.println(tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
				System.out.println(tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
				System.out.println(tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
			} else {
				System.out.println("Ya hay una ficha en esas coordenadas");
			}
			System.out.println("Jugador 1 - ingrese las coordenadas donde desea colocar la ficha:");
			coordenadaFila = sc.nextInt();
			coordenadaColumna = sc.nextInt();
		}
		System.out.println("¡HAY UN GANADOR!");
		System.out.println(tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
		System.out.println(tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
		System.out.println(tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
	}

	private static void reglasDelJuego() {
		System.out.println("¡BIENVENIDO AL JUEGO DEL TA-TE-TI!");
		System.out.println("REGLAS DEL JUEGO:");
		System.out.println("- El primer jugador coloca una ficha en cualquiera de los casilleros libres del tablero.");
		System.out.println("- El segundo jugador hará lo mismo con su primera ficha.");
		System.out.println("- Se continúa las otras jugadas respetando los turnos.");
		System.out.println("- El jugador que consiga alinear tres marcas del mismo tipo hace ¡TA-TE-TI!.");
		System.out.println("- Si se marcan todas las celdas vacías, no hay ganador, es un empate.");
		System.out.println("IMPORTANTE:");
		System.out.println("- El jugador 1 usará las fichas X y el jugador 2 usará las fichas O");
		System.out.println(
				"- El programa te pedirá que ingreses las coordenas para colocar la ficha en el tablero, esas coordenadas serán en orden FILA - COLUMNA");
		System.out.println("A continuación te mostramos el tablero con las coordenadas:");
		System.out.println("    0   1   2 ");
		System.out.println(" 0 ___|___|___");
		System.out.println(" 1 ___|___|___");
		System.out.println(" 2    |   |   ");
	}

}
