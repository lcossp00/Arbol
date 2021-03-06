import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Fuente
{
	String cadena;
	char[] cadenaVector;
	ArrayList<Integer> frecuencia = new ArrayList<Integer>();
	ArrayList<Character> simbolos = new ArrayList<Character>();
	ArrayList<Double> probabilidad = new ArrayList<Double>();
	boolean repetido = false;

	//Parte Dos
	ArrayList<String> binario = new ArrayList<String>();
	ArrayList<String> posicion = new ArrayList<String>();
	ArrayList<Double> copiaProb = new ArrayList<Double>();
	ArrayList<String> pos = new ArrayList<String>();


	
	public Fuente()
	{
	 //Contructor
		cadena = "La noche cae, brumosa ya y morada. Vagas claridades malvas y verdes perduran tras la torre de la iglesia. El camino sube, lleno de sombras, de campanillas, de fragancia de hierba, de canciones, de cansancio y de anhelo.\r\n";

		
	}
	
	public void frecuencia()
	{
		cadenaVector = cadena.toCharArray();
		
		for(int i=0; i<cadenaVector.length; i++)
		{
			repetido = false;
			if(i == 0)
			{
				 simbolos.add(cadenaVector[i]);
				 frecuencia.add(1);
			}
			else
			{
		        for (int j =0; j<simbolos.size(); j++)
		        {
		        	if(cadenaVector[i] == simbolos.get(j))
		        	{

		        		frecuencia.set(j,frecuencia.get(j) + 1);
		        		repetido = true;
		        	}
		        	
		        }

		        
		        if(repetido == false)
		        {
		        	simbolos.add(cadenaVector[i]);
		        	frecuencia.add(1);
		        }
		        

			}

	    }
		
		
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(frecuencia, comparador);
		
		System.out.println(frecuencia);	
		

	}

	public void probabilidad()
	{

		double resultado;
		
		for(int i = 0;i<simbolos.size();i++)
		{
			resultado = Math.round(frecuencia.get(i)/(double)cadena.length() * 1000d) / 1000d;
			probabilidad.add(resultado);
		}
		
		System.out.println(probabilidad);
	}
	
	public void arbolHuffman()
	{
		copiaProb = probabilidad;
		double numero1 = 0;
		double numero2 = 0;
		double numeroSuma = 0;
		int cont = probabilidad.size() - 1;
		System.out.println(probabilidad.size());
		for(int i= 0 ;i <=cont;i++)
		{
			pos.add(""+i);
		}
		System.out.println(pos);
		System.out.println(probabilidad.size());
		for(int i= 0 ;i <cont;i++)
		{
			int index = 0;
			for(Double n: copiaProb)
			{
				if(copiaProb.get(index) <= n)
				{
					numero1 = copiaProb.get(index);
					
				}
				index++;
					
			}
			copiaProb.remove(index - 1);
			
			int index2 = 0;
			for(Double n: copiaProb)
			{
				if(copiaProb.get(index2) <= n)
				{
					numero2 = copiaProb.get(index2);
					
				}
				index2++;
					
			}
			copiaProb.remove(index2-1);
			
			posicion.add("" + pos.get(index-1) + pos.get(index2-1));
			System.out.println(posicion);
			pos.remove(index-1);
			pos.remove(index2-2);
			
			//System.out.println(posicion);
			numeroSuma = numero1 + numero2;
			copiaProb.add(numeroSuma);
			
		
		}
		
		//System.out.println(copiaProb);
	}
	/*public void arbolHuffman()
	{
		copiaProb = probabilidad;
		double numero1 = 0;
		double numero2 = 0;
		double numeroSuma = 0;
		int cont = probabilidad.size() - 1;
		System.out.println(probabilidad.size());

		for(int i= 0 ;i <cont;i++)
		{
			int index = 0;
			for(Double n: copiaProb)
			{
				if(copiaProb.get(index) <= n)
				{
					numero1 = copiaProb.get(index);
					
				}
				index++;
					
			}
			copiaProb.remove(index - 1);
			
			int index2 = 0;
			for(Double n: copiaProb)
			{
				if(copiaProb.get(index2) <= n)
				{
					numero2 = copiaProb.get(index2);
					
				}
				index2++;
					
			}
			copiaProb.remove(index2-1);
			
			posicion.add("" + index + index2);
			System.out.println(posicion);
			numeroSuma = numero1 + numero2;
			copiaProb.add(numeroSuma);
			
		
		}
		
		System.out.println(copiaProb);
	}*/
	
}
