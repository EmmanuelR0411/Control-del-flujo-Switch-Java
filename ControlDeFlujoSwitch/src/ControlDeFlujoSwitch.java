import java.util.Scanner;

public class ControlDeFlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch (condicion){
		 * case valor:
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * case valor2:
		 * 		codigo
		 * 		codigo
		 * 		breack;
		 * default:
		 * 		codigo por defecto
		 */
		/*int dia = 1;
		String mensaje ="";
		
		switch(dia) {
		case 1:
			mensaje = "Lunes";
			break;
		case 2:
			mensaje = "Martes";
			break;
		case 3:
			mensaje = "Miercoles";
			break;
		case 4:
			mensaje = "Jueves";
			break;
		case 5:
			mensaje = "Viernes";
			break;
		case 6:
			mensaje = "Sabado";
			break;
		case 7:
			mensaje = "Domingo";
			break;
			default:
				mensaje = "No es un día de la semana";
		}
		
		System.out.println(mensaje);*/
		
		/*
		 * CAlculadora que pide dos numeros y posterior a eso pide la opeacion
		 * a realizar, el menu es el siguiente:
		 * 1. suma
		 * 2. resta
		 * 3. multiplicación
		 * 4. división
		 * 
		 * Al final debe de mostrar los resultados de la operacion
		 */
		/*float numero1;
		Scanner leerNumero1 = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		numero1 = leerNumero1.nextFloat();
		
		float numero2;
		Scanner leerNumero2 = new Scanner(System.in);
		System.out.println("Ingrese otro numero: ");
		numero2 = leerNumero2.nextFloat();
		
		int operacion;
		System.out.println("Seleccione una operacion a realizar: ");
		System.out.println("1.- Suma ");
		System.out.println("2.- Resta ");
		System.out.println("3.- Multiplicación ");
		System.out.println("4.- División ");
		Scanner leerOperacion = new Scanner(System.in);
		operacion = leerOperacion.nextInt();*/
		
//		float resultado = calculadora(numero1,numero2,operacion);
		
		/*if (resultado != 0) {
			System.out.println("El resultado es: " + resultado);
	}
		else {
		System.out.println("Opcion no valida");
		}*/
//-----------------------------------------------------------------------
		/*
		 * Crear un programa donde se introduzcan los tres ángulos internos de 
		 * un triángulo y se determine si el triángulo es válido o no. 
		 */
		Scanner angulo = new Scanner(System.in);
		System.out.println("Ingrese el primer angulo interno: ");
		int anguloUno = angulo.nextInt();
		
		System.out.println("Ingrese el segundo angulo interno: ");
		int anguloDos = angulo.nextInt();
		
		System.out.println("Ingrese el tercer angulo interno: ");
		int anguloTres = angulo.nextInt();
		
		String mensaje = Triangulo(anguloUno, anguloDos, anguloTres);
		System.out.println(mensaje);
		
		
	}
	
	public static String Triangulo (int anguloUno, int anguloDos, int anguloTres) 
	{
		int suma = anguloUno + anguloDos + anguloTres;
		String mensaje = "";
		if (anguloUno == 180 || anguloDos == 180 || anguloTres == 180 ||
			anguloUno <= 0 || anguloDos <= 0 || anguloTres <= 0) {
			mensaje = "La suma de los angulos de todos los triangulos es de" +
			" 180° \nLa suma de los angulos que proporcionaste es: " + suma +"°" 
			+"\nPero tus valores son incorrectos" + 
			"\nAsí que no tienes un triangulo :(" + "\nVerifica tus datos";
		} else if (suma == 180){
			mensaje =  "La suma de tus angulos es: " + suma + "°" + 
					"\n¡Tienes un triangulo! :D";
		} else {
			mensaje = "La suma de los angulos de todos los triangulos es de" +
			" 180° \nLa suma de los angulos que proporcionaste es: " + suma +"°" 
			+ "\nAsí que no tienes un triangulo :(";
		}
		return mensaje;
	}
	
	public static float calculadora(float numero1, float numero2, int operacion)
	{
		float resultado = 0;
		
		switch (operacion) {
		case 1:
			resultado = numero1 + numero2;
			
			break;
		case 2:
			resultado = numero1 - numero2;
			
			break;
		case 3:
			resultado = numero1 * numero2;
			
			break;
		case 4:
			resultado = numero1 / numero2;
			
			break;
			default:
				resultado = 0;
		}
		
		return resultado;
		
	}
		

}
