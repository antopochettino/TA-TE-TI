package juego;

public class Ganador {

	public static void main(String[] args) {
		//If para analizar si hay un ganador y escribir el mensaje HAY UN GANADOR o seguir jugando. 
		if ((tablero[0][0] != "___") && (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2]) || (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2])
				|| (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2]) || (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0]) || (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1])
				|| (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2]) || (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) || (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2])) {
			
			mensaje = "HAY UN GANADOR";
			System.out.println(tablero[0][0] + "|" + tablero[0][1] + "|" + tablero[0][2]);
			System.out.println(tablero[1][0] + "|" + tablero[1][1] + "|" + tablero[1][2]);
			System.out.println(tablero[2][0] + "|" + tablero[2][1] + "|" + tablero[2][2]);
			}
	}

}
