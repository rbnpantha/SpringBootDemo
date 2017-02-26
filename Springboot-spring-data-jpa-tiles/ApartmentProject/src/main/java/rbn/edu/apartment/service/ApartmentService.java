package rbn.edu.apartment.service;

import java.util.List;

import rbn.edu.apartment.domain.Apartment;

public interface ApartmentService {
	
	public void saveApartment(Apartment apartment);

	public void deleteApartmentById(int apartmentId);

	public Apartment getApartmentById(int apartmentId);
	
	public List<Apartment> getAllApartment();

	public List<Apartment> getApartmentByOwnerId(int ownerId);
	
	public List<Apartment> getApartmentByCustomerId(int customerId);
	
	public void updateBooking(Apartment apartment);
}