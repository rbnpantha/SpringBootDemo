package rbn.edu.apartment.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rbn.edu.apartment.domain.Apartment;




@Repository
public interface ApartmentDAO extends CrudRepository <Apartment, Integer>{
	
	
	/*@Query("FROM Apartment apt WHERE apt.customerId= :customerId")
	public List<Apartment> findByCustomerId(@Param("customerId") int customerId);
*/

}