
package repository;

import entity.Orador;
import java.util.List;

/**
 *
 * @author Luciana Calvi
 */
public interface OradorRepository {
    
        public void save(Orador orador);
	public Orador getById(Long id);
	public void update(Orador orador);
	public void delete(Long id);
	public List<Orador> findAll();
}
