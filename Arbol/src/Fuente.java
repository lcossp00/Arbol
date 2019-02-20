import java.text.DecimalFormat;
import java.util.ArrayList;

public class Fuente
{
	String cadena;
	char[] cadenaVector;
	ArrayList<Integer> frecuencia = new ArrayList<Integer>();
	ArrayList<Character> simbolos = new ArrayList<Character>();
	ArrayList<Double> probabilidad = new ArrayList<Double>();
	boolean repetido = false;


	
	public Fuente()
	{
	 //Contructor
		cadena = "La noche cae, brumosa ya. Vagas claridades malvas y verdes tras la torre de la iglesia. El camino sube, lleno de sombras, de campanillas, de fragancia de hierba, de canciones, de cansancio y de anhelo.";
		//noche cae,brumosa ya y morada.Vagas claridades malvas y verdes tras la torre de la iglesia.El camino sube,lleno de sombras,de campanillas, de fragancia de hierba,de canciones,de cansancio y de anhelo.
		
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
		        		System.out.println("hOLA");
		        		frecuencia.set(j,frecuencia.get(j) + 1);
		        		repetido = true;
		        	}
		        	
		        }

		        
		        if(repetido == false)
		        {
		        	System.out.println(cadenaVector[i]);
		        	System.out.println("Adios");
		        	simbolos.add(cadenaVector[i]);
		        	frecuencia.add(1);
		        }
		        

			}

	    }
		
		System.out.println(simbolos);	
		System.out.println(frecuencia);	
		

	}

	public void probabilidad()
	{

		double resultado;
		
		/*for(int i = 0;i<simbolos.size();i++)
		{
			resultado = Math.round(frecuencia.get(i)/(double)simbolos.size() * 1000d) / 1000d;
			probabilidad.add(resultado);
		}
		*/
		System.out.println(probabilidad);
		System.out.println(simbolos.size());
	}
	public void ordenado()
	{
		
	}
}
