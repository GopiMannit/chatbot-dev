package com.mannit.chatbot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mannit.chatbot.model.Botread;

public interface Botreadrepo extends MongoRepository<Botread, String> {
	@Query("{ 'timestamp' : { $regex: ?0, $options: 'i' } }")
	 List<Botread> findAllBydate(String date);
	
	@Query("{'timestamp' : {$gte : ?0, $lte : ?1}}}}")
	List<Botread> findBydate(String fromdate,String todate);
}
