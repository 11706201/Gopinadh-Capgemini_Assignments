package com.gopinadh.booking;

import org.springframework.data.repository.CrudRepository;
public interface BookingMongoRepository extends CrudRepository<Booking, String> {

}
