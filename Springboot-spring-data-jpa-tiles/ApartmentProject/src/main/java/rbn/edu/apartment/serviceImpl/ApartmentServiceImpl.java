package rbn.edu.apartment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rbn.edu.apartment.DAO.ApartmentDAO;
import rbn.edu.apartment.domain.Apartment;
import rbn.edu.apartment.service.ApartmentService;

@Service
public class ApartmentServiceImpl implements ApartmentService{

	@Autowired
	ApartmentDAO apartmentDAO;
	
	@Override
	public void saveApartment(Apartment apartment) {
		apartmentDAO.save(apartment);
		
	}

	@Override
	public void deleteApartmentById(int apartmentId) {
		apartmentDAO.delete(apartmentId);
		
	}

	@Override
	public Apartment getApartmentById(int apartmentId) {
		
		return apartmentDAO.findOne(apartmentId);
	}

	@Override
	public List<Apartment> getApartmentByOwnerId(int ownerId) {
		
		//return apartmentDAO.findByOwnerId(ownerId);
		return null;
	}

	@Override
	public List<Apartment> getApartmentByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		//return apartmentDAO.findOne(customerId);
		return null;
	}

	@Override
	public void updateBooking(Apartment apartment) {
		
		apartmentDAO.save(apartment);
	}

	@Override
	public List<Apartment> getAllApartment() {
		
		return (List<Apartment>) apartmentDAO.findAll();
	}

}
