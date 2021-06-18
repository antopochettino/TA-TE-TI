package juego;

import java.util.Scanner;

public class TaTeTi {

	public static void main(String[] args) {
		int coordenadaFila, coordenadaColumna, contador;
		contador = 0;
		boolean turno = true;
		String mensaje = " ";
		String[][] tablero = { { "___", "___", "___" }, { "___", "___", "___" }, { "___", "___", "___" } };
		Scanner sc = new Scanner(System.in);
		reglasDelJuego();
		while (mensaje != "¡HAY UN GANADOR!" && contador < 9) {
			contador++;
			mensaje = hayGanadorOSigue(turno, mensaje, tablero, sc);
			turno = !turno;
		}
		if (contador >= 9) {
			mensajeEmpate(tablero);
		}
	}

	private static String hayGanadorOSigue(boolean turno, String mensaje, String[][] tablero, Scanner sc) {
		if ((tablero[0][0] != "___") && (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2])
				|| (tablero[1][0] != "___") && (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2])
				|| (tablero[2][0] != "___") && (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2])
				|| (tablero[0][0] != "___") && (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0])
				|| (tablero[0][1] != "___") && (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1])
				|| (tablero[0][2] != "___") && (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2])
				|| (tablero[0][0] != "___") && (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])
				|| (tablero[1][1] != "___") && (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2])) {
			System.out.println(mensaje = "¡HAY UN GANADOR!");
			mensajeGanador(turno, tablero);
		} else {
			jugarFicha(tablero, sc, turno);
		}
		return mensaje;
	}

	private static void mensajeGanador(boolean turno, String[][] tablero) {
		if (turno) {
			System.out.println("EL GANADOR FUE EL JUGADOR 2");
			mostrarTablero(tablero);
			System.out.println("!FELICIDADES¡");
		} else {
			System.out.println("EL GANADOR FUE EL JUGADOR 1");
			mostrarTablero(tablero);
			System.out.println("!FELICIDADES¡");
		}
	}

	private static void mensajeEmpate(String[][] tablero) {
		System.out.println("~~~~~~~~~~~~");
		System.out.println("ES UN EMPATE");
		System.out.println("~~~~~~~~~~~~");
		mostrarTablero(tablero);
		System.out.println("FIN DEL JUEGO");
	}

	private static void mostrarTablero(String[][] tablero) {
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

	private static void mostrarTurnoActual(boolean turno) {
		if (turno) {
			System.out.println("Jugador 1 - ingrese las coordenadas donde desea colocar la ficha:");
		} else {
			System.out.println("Jugador 2 - ingrese las coordenadas donde desea colocar la ficha:");
		}

	}

	private static void jugarFicha(String[][] tablero, Scanner sc, boolean turno) {
		int coordenadaFila;
		int coordenadaColumna;
		mostrarTurnoActual(turno);
		coordenadaFila = sc.nextInt();
		coordenadaColumna = sc.nextInt();
		if (tablero[coordenadaFila][coordenadaColumna] != "___") {
			System.out.println("Ya hay una ficha en esas coordenadas");
		} else {
			if (turno) {
				tablero[coordenadaFila][coordenadaColumna] = " X ";
				mostrarTablero(tablero);
			} else {
				tablero[coordenadaFila][coordenadaColumna] = " O ";
				mostrarTablero(tablero);
			}
		}
	}

}
