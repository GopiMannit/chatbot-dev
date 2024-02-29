package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Botsent;

public interface Botsentrepo extends MongoRepository<Botsent, String> {
	@Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
	List<Botsent> findAllBydate(String date);

	@Query("{'timestamp' : {$gte : ?0, $lte : ?1}}}}")
	List<Botsent> findBydate(String fromdate, String todate);
	
	  @Query("{'timestamp': {'$gte': { $dateFromString: { dateString: ?0 }}, '$lte': { $dateFromString: { dateString: ?1 }}}}"
	  ) List<Botsent> findByDateRange(String fromDate, String toDate);
	 

}
