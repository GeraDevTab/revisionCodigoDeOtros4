package Codigo4;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//agrega parametro System.in a la instanciacion del objeto Scanner
		  	Scanner entrada = new Scanner(System.in);
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    
		    //cqambio de nombre de variable de j1 a jugador1
		    String jugador1 = entrada.nextLine();
		    
		    //cambio en el numero del jugador 2, en el mensaje
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		    
		    //Scanner s2 = new Scanner(System.in);
		    String jugador2 = entrada.nextLine();
		    
		    //se cambio a equals para la comparacion de los objetos envueltos de las datos primitivos
		    if (jugador1.equals(jugador2)) {
		    	//se movio la line de impresion siguiente dentro de las llaves del if
		    	System.out.println(jugador1);
		    	System.out.println(jugador2);
		    	System.out.println("Empate");
		    	
		    }
		    //se elimina una llave
		    else {
		    	//System.out.println(jugador1);
		    	//System.out.println(jugador2);
		    	//cambio de nombre de variable de g a ganador
		    int ganador = 2;
		    
		    switch(jugador1)
		    {
		        case "piedra":
		          if (jugador2.equals("tijeras")) {
		            ganador = 1;
		            break;
		          }
		          else if(jugador2.equals("papel")) {
			            ganador = 2;
			            break;
		          }
		        case "papel":
		          if (jugador2.equals("piedra")) {
		            ganador = 1;
		            break;
		          }
		    
		          else if(jugador2.equals("tijera")) {
		            ganador = 2;
		            break;
		          }
		        case "tijera":
		          if (jugador2.equals("papel")) {
		            ganador = 1;
		            break;
		          }
		          else if(jugador2.equals("piedra")) {
			         ganador = 2;
			         break;
			      }
		        default:{
		        	System.out.println("ha ingresado un dato que no permite, definir el ganador :D");
		        	ganador = 0;
		        }
		      }
		      System.out.println("Gana el jugador " + ganador);
		    }
	}

}
