package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Botdelivered;


public interface Botdeliveredrepo extends MongoRepository<Botdelivered, String> {
	@Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
	 List<Botdelivered> findAllBydate(String date);
	
	@Query("{'timestamp' : {$gte : ?0, $lte : ?1}}}}")
	List<Botdelivered> findBydate(String fromdate,String todate);
}
