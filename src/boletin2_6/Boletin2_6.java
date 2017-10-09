
package boletin2_6;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pt, pp;
        Scanner sc=new Scanner (System.in);
        System.out.println("Precio tarifa :");
        pt=sc.nextFloat();
        System.out.println("Precio pagado :");
        pp=sc.nextFloat();
        System.out.println("Porcentaje = "+(100-(pp*100/pt))+"%");
        
        
    }
    
}
