
package entity;

import java.time.LocalDate;

/**
 *
 * @author Luciana Calvi
 */
public class OradorMain {

    public static void main(String[] args) {
        
                Orador nuevoOrador = new Orador("carlos", "lopez", "email@email.com", "java", LocalDate.now());
		
		
		System.out.println(nuevoOrador);
		
		
		Orador nuevoFromDB = new Orador(1L,"carlos", "lopez", "email@email.com", "java", LocalDate.now());
		
		
		nuevoOrador.setNombre("pepe");
    }
    
}
