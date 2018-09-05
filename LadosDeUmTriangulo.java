import java.util.Scanner; 

public class LadosDeUmTriangulo
{
   
    public static void main (String[] args)
    {
       
        Scanner input = new Scanner(System.in );

        int LadoA; 
        int LadoB; 
        int LadoC;

        System.out.print("Insira o primeiro lado "); 
        LadoA = input.nextInt(); 

        System.out.print("Insira o segundo lado "); 
        LadoB = input.nextInt(); 

        System.out.print("Insira o terceiro lado "); 
        LadoC = input.nextInt(); 


        if(LadoA == LadoB && LadoA == LadoC)
            System.out.print("este tri\u00e2ngulo \u00e9 equil\u00e1tero");
            
        if(LadoA != LadoB && LadoA != LadoC)
            System.out.print("O tri\u00e2ngulo \u00e9 escaleno"); 
            
        if((LadoA == LadoB && LadoA != LadoC) || (LadoA != LadoB && LadoA == LadoC)) 
            System.out.printf("este tri\u00e2ngulo \u00e9 is\u00f3celes");    
    }
}