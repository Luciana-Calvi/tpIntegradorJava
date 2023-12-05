package repository;


import entity.Orador;
import java.time.LocalDate;
import java.util.List;


public class MainOradorRepository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                OradorRepository repository = new MySQLOradorRepository();
		
		Orador nuevo = new Orador("marcelo", "lopez", "emailc@email.com", "c#", LocalDate.now());
		repository.save(nuevo);
		
		List<Orador> oradores = repository.findAll();
		
		System.out.println(oradores);
    }
    
}
